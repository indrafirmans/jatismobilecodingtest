package com.imdev.jatismobilecodingtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdev.jatismobilecodingtest.entity.OrderDetails;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

    List<OrderDetails> findByOrderId(Integer orderId);
}
