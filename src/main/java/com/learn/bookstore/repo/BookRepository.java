package com.learn.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{}
