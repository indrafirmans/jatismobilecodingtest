package com.imdev.jatismobilecodingtest.controller;

import com.imdev.jatismobilecodingtest.dto.response.DefaultResponse;
import com.imdev.jatismobilecodingtest.dto.response.OrderDetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.imdev.jatismobilecodingtest.common.Prefix;
import com.imdev.jatismobilecodingtest.service.CsvService;

import java.util.List;

@RestController
@RequestMapping(value = Prefix.URL_UPLOAD + Prefix.URL_CSV)
public class CsvController {

    @Autowired
    private CsvService csvService;

    private static String MSG_SUCCESS_UPLOAD = "Success upload data";

    @PostMapping(value = Prefix.URL_CUSTOMER)
    public DefaultResponse<String> customer(@RequestParam(name = Prefix.FILE) MultipartFile file) {
        csvService.customer(file);
        DefaultResponse response = new DefaultResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(MSG_SUCCESS_UPLOAD);
        return response;
    }

    @PostMapping(value = Prefix.URL_EMPLOYEE)
    public DefaultResponse<String> employee(@RequestParam(name = Prefix.FILE) MultipartFile file) {
        csvService.employee(file);
        DefaultResponse response = new DefaultResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(MSG_SUCCESS_UPLOAD);
        return response;
    }

    @PostMapping(value = Prefix.URL_SHIPPING_METHOD)
    public DefaultResponse<String> shippingMethod(@RequestParam(name = Prefix.FILE) MultipartFile file) {
        csvService.shippingMethod(file);
        DefaultResponse response = new DefaultResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(MSG_SUCCESS_UPLOAD);
        return response;
    }

    @PostMapping(value = Prefix.URL_PRODUCT)
    public DefaultResponse<String> product(@RequestParam(name = Prefix.FILE) MultipartFile file) {
        csvService.product(file);
        DefaultResponse response = new DefaultResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(MSG_SUCCESS_UPLOAD);
        return response;
    }

    @PostMapping(value = Prefix.URL_ORDERS)
    public DefaultResponse<String> order(@RequestParam(name = Prefix.FILE) MultipartFile file) {
        csvService.order(file);
        DefaultResponse response = new DefaultResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(MSG_SUCCESS_UPLOAD);
        return response;
    }

    @PostMapping(value = Prefix.URL_ORDER_DETAILS)
    public DefaultResponse<String> orderDetail(@RequestParam(name = Prefix.FILE) MultipartFile file) {
        csvService.orderDetails(file);
        DefaultResponse response = new DefaultResponse();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        response.setData(MSG_SUCCESS_UPLOAD);
        return response;
    }
}
