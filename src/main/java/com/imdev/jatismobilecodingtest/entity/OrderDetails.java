package com.imdev.jatismobilecodingtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Integer orderDetailID;

    @Column(name = "order_id")
    private String orderID;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "unit_price")
    private String unitPrice;

    @Column(name = "discount")
    private String discount;
}