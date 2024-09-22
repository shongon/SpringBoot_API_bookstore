package com.learn.bookstore.service.Author;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.bookstore.model.Author;
import com.learn.bookstore.repo.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public String upsert(Author author) {
        authorRepository.save(author);
        return "success";
    }

    @Override
    public Author getbyId(Integer author_id) {
        Optional<Author> findByID = authorRepository.findById(author_id);

        if (findByID.isPresent()) {
            return findByID.get();
        }

        return null;
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public String deteleByID(Integer author_id) {
        if (authorRepository.existsById(author_id)) {
            authorRepository.deleteById(author_id);
            return "Delete Success";
        }else{
            return "No Record Found";
        }
    }
    
}
