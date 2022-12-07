package com.imdev.jatismobilecodingtest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
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
