package com.imdev.jatismobilecodingtest.service;

import com.imdev.jatismobilecodingtest.dto.response.OrderDetailResponse;
import com.imdev.jatismobilecodingtest.entity.*;
import com.imdev.jatismobilecodingtest.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private EmployeesRepository employeesRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Autowired
    private ProductsRepository productsRepository;

    public List<OrderDetailResponse> order() {
        List<OrderDetailResponse> result = new ArrayList<>();
        List<Orders> orders = ordersRepository.findAll();

        for (Orders order : orders) {
            Integer totalPayment = 0;
            OrderDetailResponse data = new OrderDetailResponse();

            Customers customers = customersRepository.findById(order.getCustomerId()).orElse(null);
            Employees employees = employeesRepository.findById(order.getEmployeeId()).orElse(null);
            List<OrderDetails> orderDetails = orderDetailsRepository.findByOrderId(order.getOrderId());
            List<Map> orderDetailsWithSubTotalPrice = new ArrayList<>();

            for (OrderDetails orderDetail : orderDetails) {
                Map dataMap = new HashMap();
                Products dataProduct = productsRepository.findById(orderDetail.getProductId()).orElse(null);
                if (!Objects.isNull(dataProduct)) {
                    dataMap.put("productName", dataProduct.getProductName());
                    dataMap.put("quantity", orderDetail.getQuantity());
                    dataMap.put("unitPrice", orderDetail.getUnitPrice());
                    dataMap.put("subTotalPrice", orderDetail.getQuantity() * orderDetail.getUnitPrice());
                    totalPayment += orderDetail.getQuantity() * orderDetail.getUnitPrice();
                }
                orderDetailsWithSubTotalPrice.add(dataMap);
            }

            data.setCustomerName(customers.getCompanyName());
            data.setEmployeeName(employees.getFirstName().concat(" ").concat(employees.getLastName()));
            data.setProductList(orderDetailsWithSubTotalPrice);
            data.setTotalPayment(totalPayment);
            result.add(data);
        }

        return result;
    }
}
