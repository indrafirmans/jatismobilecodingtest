package com.imdev.jatismobilecodingtest.repository;

import com.imdev.jatismobilecodingtest.entity.ShippingMethods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdev.jatismobilecodingtest.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

    Products findByProductName(String productName);
}
