package com.learn.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.bookstore.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {}
