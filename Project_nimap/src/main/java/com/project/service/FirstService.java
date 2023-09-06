package com.project.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.model.category;
import com.project.repository.FirstRepository;

@Service
public class FirstService {
    @Autowired
    private FirstRepository categoryRepository;

    public List<category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public category createCategory(category category) {
        return categoryRepository.save(category);
    }

    public category updateCategory(category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
    public List<category> getAllCategories(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<category> categoryPage = categoryRepository.findAll(pageable);
        return categoryPage.getContent();
    }
}


