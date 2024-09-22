package com.learn.bookstore.service.Author;

import java.util.List;

import com.learn.bookstore.model.Author;

public interface AuthorService {

    public String upsert(Author author);
        
    public Author getbyId(Integer author_id);

    public List<Author> getAllAuthors();

    public String deteleByID(Integer author_id);
}
