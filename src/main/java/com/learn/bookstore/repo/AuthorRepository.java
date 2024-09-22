package com.learn.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.bookstore.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {}
