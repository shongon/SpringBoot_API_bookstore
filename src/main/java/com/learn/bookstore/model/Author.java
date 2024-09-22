package com.learn.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="authors")
public class Author {
    @Id
    private Integer author_id;
    private String author_name;
}
