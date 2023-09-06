package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.product;

public interface SecondRepository extends JpaRepository<product, Long> {
}
