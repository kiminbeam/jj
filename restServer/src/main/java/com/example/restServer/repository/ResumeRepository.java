package com.example.restServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restServer.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long>{

}
