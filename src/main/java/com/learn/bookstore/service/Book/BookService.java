package com.learn.bookstore.service.Book;

import java.util.List;

import com.learn.bookstore.model.Book;

public interface BookService {
    public String upsert(Book book);

    public Book getById(Integer book_id);

    public List<Book> getAllBooks();

    public String deleteById(Integer book_id);
}
