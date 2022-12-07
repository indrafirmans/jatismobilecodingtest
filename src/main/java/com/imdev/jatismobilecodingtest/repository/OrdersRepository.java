package com.imdev.jatismobilecodingtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imdev.jatismobilecodingtest.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    
}
