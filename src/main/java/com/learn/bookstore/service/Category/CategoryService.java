package com.learn.bookstore.service.Category;

import java.util.List;

import com.learn.bookstore.model.Category;

public interface CategoryService {
    public String upsert(Category category);
        
    public Category getbyId(Integer category_id);

    public List<Category> getAllCategories();

    public String deteleByID(Integer category_id);
}
