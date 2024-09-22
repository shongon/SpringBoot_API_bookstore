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

import com.learn.bookstore.model.Author;
import com.learn.bookstore.service.Author.AuthorService;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    //Get all authors
    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }
    //Get author by ID
    @GetMapping("/author/{author_id}")
    public Author getAuthor(@PathVariable Integer author_id){
        return authorService.getbyId(author_id);
    }  
    //Create new author (Including new id and new name)
    @PostMapping("/author")
    public String createAuthor (@RequestBody Author author){
       return authorService.upsert(author);
    }
    //Update author (Including old id and new name)
    @PutMapping("/author")
    public String updateAuthor (@RequestBody Author author){
        return authorService.upsert(author);
    }
    //Delete by old ID
    @DeleteMapping("/author/{author_id}")
    public String deleteAuthor(@PathVariable Integer author_id){
        return authorService.deteleByID(author_id);
    }
}
