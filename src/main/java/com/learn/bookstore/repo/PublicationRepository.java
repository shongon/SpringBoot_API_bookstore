package com.learn.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.bookstore.model.Publication;

public interface PublicationRepository extends JpaRepository<Publication,Integer>{}
