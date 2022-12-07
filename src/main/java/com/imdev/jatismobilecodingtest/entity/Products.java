package com.imdev.jatismobilecodingtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private String unitPrice;

    @Column(name = "in_stock")
    private String inStock;
}
