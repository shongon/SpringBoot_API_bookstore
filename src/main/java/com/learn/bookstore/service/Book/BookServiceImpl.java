package com.learn.bookstore.service.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.bookstore.model.Book;
import com.learn.bookstore.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;

    @Override
    public String upsert(Book book) {
        bookRepository.save(book);
        return "success";
    }

    @Override
    public Book getById(Integer book_id) {
        Optional<Book> findById = bookRepository.findById(book_id);
        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public String deleteById(Integer book_id) {
        if (bookRepository.existsById(book_id)) {
            bookRepository.deleteById(book_id);
            return "Delete Success";
        }
        return "No Record Found";
    }
    
}
