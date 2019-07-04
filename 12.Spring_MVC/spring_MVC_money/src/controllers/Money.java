package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Money {
    @GetMapping("/")
    public String Conversion(){
        return "index";
    }

    @PostMapping ("/money")
    public String Conversion(@RequestParam("USD") float usd, @RequestParam("rate") float rate, Model model){
        float vnd =usd *rate;
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        model.addAttribute("vnd",vnd);
        return "display";

    }
}
