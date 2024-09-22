package com.learn.bookstore.service.Publication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.bookstore.model.Publication;
import com.learn.bookstore.repo.PublicationRepository;

@Service
public class PublicationServiceImpl implements PublicationService{
    @Autowired
    PublicationRepository publicationRepository;

    @Override
    public String upsert(Publication publication) {
        publicationRepository.save(publication);
        return "success";
    }

    @Override
    public Publication getById(Integer publication_id) {
        Optional<Publication> findByID = publicationRepository.findById(publication_id);
        if(findByID.isPresent()){
            return findByID.get();
        }
        return null;
    }

    @Override
    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    @Override
    public String deleteById(Integer publication_id) {
       if(publicationRepository.existsById(publication_id)){
        publicationRepository.deleteById(publication_id);
        return "Delete Success";
       }
       return "No Record Found";
    }
    
}
