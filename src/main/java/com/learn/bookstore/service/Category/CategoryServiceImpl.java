package com.learn.bookstore.service.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.bookstore.model.Category;
import com.learn.bookstore.repo.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public String upsert(Category category) {
        categoryRepository.save(category);
        return "success";
    }

    @Override
    public Category getbyId(Integer category_id) {
        Optional<Category> findByID = categoryRepository.findById(category_id);
        if (findByID.isPresent()) {
            return findByID.get();
        }
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public String deteleByID(Integer category_id) {
        if (categoryRepository.existsById(category_id)) {
            categoryRepository.deleteById(category_id);
            return "Delete Success";
        }
        
        return "No Record Found";
        
    }
    
}
