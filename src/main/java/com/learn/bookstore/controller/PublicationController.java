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

import com.learn.bookstore.model.Publication;
import com.learn.bookstore.service.Publication.PublicationService;

@RestController
public class PublicationController {
    @Autowired
    private PublicationService publicationService;

    @GetMapping("/publications")
    public List<Publication> getAllPublications(){
        return publicationService.getAllPublications();
    }

    @GetMapping("/publication/{publication_id}")
    public Publication getPublication(@PathVariable Integer publication_id){
        return publicationService.getById(publication_id);
    }

    @PostMapping("/publication")
    public String createPublication (@RequestBody Publication publication){
        return publicationService.upsert(publication);
    }


    @PutMapping("/publication/{publication_id}")
    public String updatePublication (@RequestBody Publication publication){
        return publicationService.upsert(publication);
    }

    @DeleteMapping("/publication/{publication_id}")
    public String deletePublication(@PathVariable Integer publication_id){
        return publicationService.deleteById(publication_id);
    }
}
