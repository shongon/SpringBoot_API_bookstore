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

import com.learn.bookstore.model.Category;
import com.learn.bookstore.service.Category.CategoryService;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/category/{category_id}")
    public Category getCategory(@PathVariable Integer category_id){
        return categoryService.getbyId(category_id);
    }

    @PostMapping("/category")
    public String createCategory (@RequestBody Category category){
        return categoryService.upsert(category);
    }

    @PutMapping("/category")
    public String updateCategory (@RequestBody Category category){
        return categoryService.upsert(category);
    }

    @DeleteMapping("/category/{category_id}")
    public String deleteCategory (@PathVariable Integer category_id){
        return categoryService.deteleByID(category_id);
    }
}
