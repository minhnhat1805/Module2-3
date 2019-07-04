package com.codegym.cms.controller;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import com.codegym.cms.service.BlogService;
import com.codegym.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BlogService blogService;

    @GetMapping("/categories")
    public ModelAndView listCategory() {
        Iterable<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/listCategory");
        modelAndView.addObject("categories",categories);
        return modelAndView;
    }
    @GetMapping("/create-category")
    public  ModelAndView createCategory(){
        ModelAndView modelAndView = new ModelAndView("/createCategory");
        modelAndView.addObject("category",new Category());
        return  modelAndView;

    }
    @PostMapping("/create-category")
        public ModelAndView saveCategory(@ModelAttribute("category") Category category){
    categoryService.save(category);
    ModelAndView modelAndView = new ModelAndView("/createCategory");
    modelAndView.addObject("category",new Category());
    modelAndView.addObject("message","Create category successfully");
    return modelAndView;
    }

    @GetMapping("/edit-category/{id}")
    public ModelAndView editCategory(@PathVariable Long id){
        Category category= categoryService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/editCategory");
        modelAndView.addObject("category",category);
        return modelAndView;
    }
    @PostMapping("/edit-category")
        public ModelAndView  updateCategory(@ModelAttribute("category") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/editCategory");
        modelAndView.addObject("category",category);
        modelAndView.addObject("message","Edit Successfully");
        return modelAndView;
    }

    @GetMapping ("/delete-category/{id}")
    public ModelAndView showDelete(@PathVariable Long id){
        Category category = categoryService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/deleteCategory");
        modelAndView.addObject("category",category);
        return modelAndView;

    }
    @PostMapping("/delete-category")
    public  String deleteCategory(@ModelAttribute("category") Category category){
        categoryService.remove(category.getId());
        return "redirect:categories";
    }

}

