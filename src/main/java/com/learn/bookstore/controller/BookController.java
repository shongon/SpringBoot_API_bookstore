package com.learn.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.bookstore.model.Book;
import com.learn.bookstore.service.Book.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{book_id}")
    public Book getBook(@PathVariable Integer book_id){
        return bookService.getById(book_id);
    }

    @PostMapping("/book")
    public String createBook (@RequestBody Book book){
        return bookService.upsert(book);
    }

    @PutMapping("/book")
    public String updateBook (@RequestBody Book book){
        return bookService.upsert(book);
    }

    @DeleteMapping("/book/{book_id}")
    public String deleteBook(@PathVariable Integer book_id){
        return bookService.deleteById(book_id);
    }
}
