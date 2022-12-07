package com.imdev.jatismobilecodingtest.repository;

import com.imdev.jatismobilecodingtest.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

    Customers findByCompanyName(String companyName);
}
