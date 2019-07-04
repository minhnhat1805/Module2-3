package com.codegym.cms.controller;


import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import com.codegym.cms.service.BlogService;
import com.codegym.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;


    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public  Iterable<Category> categories(){
        return categoryService.findAll();
    }


    @GetMapping("/create")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message","New blog was created successfully.");
        return modelAndView;
    }

    @GetMapping("/blogs")
    public  ModelAndView listBlogs(@RequestParam("s") Optional<String> s, Pageable pageable){
        Page<Blog> blogs;
        if(s.isPresent()){
            blogs=blogService.findAllByTitleStatusContaining(s.get(),pageable);
        }else{
            blogs = blogService.findAll(pageable);
        }
        ModelAndView modelAndView= new ModelAndView("/list");
        modelAndView.addObject("blogs",blogs);
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditBlog(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if(blog != null){
            ModelAndView modelAndView = new ModelAndView("/editt");
            modelAndView.addObject("blog",blog);
            return  modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/editt");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message","Your blog was updated successfully ");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if(blog != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:blogs";
    }




    @GetMapping("/read/{id}")
    public ModelAndView showBlogById(@PathVariable("id") Long id){
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/read");
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }


}
