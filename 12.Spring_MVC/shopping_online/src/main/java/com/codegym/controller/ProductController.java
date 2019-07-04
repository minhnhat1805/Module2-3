package com.codegym.controller;


import com.codegym.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @ModelAttribute("products")
    public Iterable<Product> products(){return }
    @GetMapping("products")
    public ModelAndView listProducts(@RequestParam)
}
