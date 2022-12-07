package com.imdev.jatismobilecodingtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdev.jatismobilecodingtest.entity.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

    Employees findByFirstName(String firstName);
}
