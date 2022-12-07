package com.imdev.jatismobilecodingtest.service;

import java.io.IOException;
import java.util.Objects;

import com.imdev.jatismobilecodingtest.entity.*;
import com.imdev.jatismobilecodingtest.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CsvService {

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private EmployeesRepository employeesRepository;

    @Autowired
    private ShippingMethodsRepository shippingMethodsRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public void customer(MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String csvData = new String(bytes);
            String[] rows = csvData.split("\n");
            int count = 0;
            for (String row : rows) {

                if (count == 0) {
                    count++;
                    continue;
                }

                String[] value = row.contains(";") ? row.split(";") : row.split(",");
                Customers checkExistData = customersRepository.findByCompanyName(value[0]);

                if (!Objects.isNull(checkExistData)) {
                    log.info("this company already exist, {}", value[0]);
                    log.info("{}", checkExistData);
                    count++;
                    continue;
                }

                Customers values = Customers.builder()
                        .companyName(value[0])
                        .firstName(value[1])
                        .lastName(value[2])
                        .billingAddress(value[3])
                        .city(value[4])
                        .stateOrProvince(value[5])
                        .zipCode(value[6])
                        .email(value[7])
                        .companyWebsite(value[8])
                        .phoneNumber(value[9])
                        .faxNumber(value[10])
                        .shipAddress(value[11])
                        .shipCity(value[12])
                        .shipStateOrProvince(value[13])
                        .shipZipCode(value[14])
                        .shipPhoneNumber(value[15])
                        .build();

                customersRepository.save(values);
                count++;
            }

        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }

    public void employee(MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String csvData = new String(bytes);
            String[] rows = csvData.split("\n");
            int count = 0;
            for (String row : rows) {

                if (count == 0) {
                    count++;
                    continue;
                }

                String[] value = row.contains(";") ? row.split(";") : row.split(",");
                Employees checkExistData = employeesRepository.findByFirstName(value[0]);

                if (!Objects.isNull(checkExistData)) {
                    log.info("this employee already exist, {}", value[0]);
                    log.info("{}", checkExistData);
                    count++;
                    continue;
                }

                Employees values = Employees.builder()
                        .firstName(value[0])
                        .lastName(value[1])
                        .title(value[2])
                        .workPhone(value[3])
                        .build();

                employeesRepository.save(values);
                count++;
            }

        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }

    public void shippingMethod(MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String csvData = new String(bytes);
            String[] rows = csvData.split("\n");
            int count = 0;
            for (String row : rows) {

                if (count == 0) {
                    count++;
                    continue;
                }

                String[] value = row.contains(";") ? row.split(";") : row.split(",");
                ShippingMethods checkExistData = shippingMethodsRepository.findByShippingMethod(value[0]);

                if (!Objects.isNull(checkExistData)) {
                    log.info("this Shipping Method already exist, {}", value[0]);
                    log.info("{}", checkExistData);
                    count++;
                    continue;
                }

                ShippingMethods values = ShippingMethods.builder()
                        .shippingMethod(value[0])
                        .build();

                shippingMethodsRepository.save(values);
                count++;
            }

        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }

    public void product(MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String csvData = new String(bytes);
            String[] rows = csvData.split("\n");
            int count = 0;
            for (String row : rows) {

                if (count == 0) {
                    count++;
                    continue;
                }

                String[] value = row.contains(";") ? row.split(";") : row.split(",");
                Products checkExistData = productsRepository.findByProductName(value[0]);

                if (!Objects.isNull(checkExistData)) {
                    log.info("this Product already exist, {}", value[0]);
                    log.info("{}", checkExistData);
                    count++;
                    continue;
                }

                Products values = Products.builder()
                        .productName(value[0])
                        .unitPrice(Integer.parseInt(value[1]))
                        .inStock(Integer.parseInt(value[2]))
                        .build();

                productsRepository.save(values);
                count++;
            }

        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }

    public void order(MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String csvData = new String(bytes);
            String[] rows = csvData.split("\n");
            int count = 0;
            for (String row : rows) {

                if (count == 0) {
                    count++;
                    continue;
                }

                String[] value = row.contains(";") ? row.split(";") : row.split(",");

                Orders values = Orders.builder()
                        .customerId(Integer.parseInt(value[0]))
                        .employeeId(Integer.parseInt(value[1]))
                        .orderDate(value[2])
                        .purchaseOrderNumber(value[3])
                        .shipDate(value[4])
                        .shippingMethodId(Integer.parseInt(value[5]))
                        .freightCharge(value[6])
                        .taxes(value[7])
                        .paymentReceived(value[8])
                        .comment(value[9])
                        .build();

                ordersRepository.save(values);
                count++;
            }

        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }

    public void orderDetails(MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String csvData = new String(bytes);
            String[] rows = csvData.split("\n");
            int count = 0;
            for (String row : rows) {

                if (count == 0) {
                    count++;
                    continue;
                }

                String[] value = row.contains(";") ? row.split(";") : row.split(",");

                OrderDetails values = OrderDetails.builder()
                        .orderId(Integer.parseInt(value[0]))
                        .productId(Integer.parseInt(value[1]))
                        .quantity(Integer.parseInt(value[2]))
                        .unitPrice(Integer.parseInt(value[3]))
                        .discount(Integer.parseInt(value[4]))
                        .build();

                orderDetailsRepository.save(values);
                count++;
            }

        } catch (IOException e) {
            log.error("IOException: {}", e.toString());
        }
    }
}