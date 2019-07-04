package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(Long id);
    void save(Blog blog);
    void  remove(Long id);
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTitleStatusContaining(String nameCategory, Pageable pageable);
}
