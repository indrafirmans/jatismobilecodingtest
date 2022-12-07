package com.imdev.jatismobilecodingtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_methods")
public class ShippingMethods {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_method_id")
    private Integer shippingMethodID;

    @Column(name = "shipping_method")
    private String shippingMethod;
}
