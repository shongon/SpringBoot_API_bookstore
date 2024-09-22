package com.learn.bookstore.service.Publication;

import java.util.List;

import com.learn.bookstore.model.Publication;

public interface PublicationService {
    public String upsert(Publication publication);
    
    public Publication getById(Integer publication_id);

    public List<Publication> getAllPublications();

    public String deleteById(Integer publication_id);
}
