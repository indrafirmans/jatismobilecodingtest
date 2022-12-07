package com.imdev.jatismobilecodingtest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderDetailResponse<T> {

    private String customerName;

    private String employeeName;

    private String shippingMethod;

    private List<T> productList;

    private Integer totalPayment;
}
