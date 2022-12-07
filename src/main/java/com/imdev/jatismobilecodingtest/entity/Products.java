package com.imdev.jatismobilecodingtest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "products")
public class Products {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private Integer unitPrice;

    @Column(name = "in_stock")
    private Integer inStock;
}
