package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.category;

public interface FirstRepository extends JpaRepository<category, Long> {
}
