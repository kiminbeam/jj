package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, String>{

}