package com.imdev.jatismobilecodingtest.controller;

import com.imdev.jatismobilecodingtest.common.Prefix;
import com.imdev.jatismobilecodingtest.dto.response.DefaultResponse;
import com.imdev.jatismobilecodingtest.dto.response.OrderDetailResponse;
import com.imdev.jatismobilecodingtest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpClient;
import java.util.List;

@RestController
@RequestMapping(value = Prefix.URL_TRANSACTION)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = Prefix.URL_ORDER)
    public DefaultResponse<List<OrderDetailResponse>> order() {
        List<OrderDetailResponse> data = orderService.order();
        DefaultResponse<List<OrderDetailResponse>> result = new DefaultResponse<>();
        result.setStatus(HttpStatus.OK.value());
        result.setMessage(HttpStatus.OK.getReasonPhrase());
        result.setData(data);
        return result;
    }
}
