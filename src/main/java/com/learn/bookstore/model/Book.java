package com.learn.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    private Integer book_id;
    private String title;
    private Integer author_id;
    private Integer category_id;
    private Integer price;
    private String stock_status;
    private Integer copies_left;
    private Integer length;
    private Integer publication_id;
    private Integer wished_user;
    private Float ratings;
    private Float reviews;
}
