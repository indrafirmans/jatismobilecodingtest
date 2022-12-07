package com.imdev.jatismobilecodingtest.repository;

import com.imdev.jatismobilecodingtest.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdev.jatismobilecodingtest.entity.ShippingMethods;

@Repository
public interface ShippingMethodsRepository extends JpaRepository<ShippingMethods, Integer> {

    ShippingMethods findByShippingMethod(String shippingMethod);
}
