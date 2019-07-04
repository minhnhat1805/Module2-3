package com.codegym.personel_management_crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
