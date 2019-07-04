package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class Sandwich {
    @GetMapping("/save")
    String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/save")
    public String save(@RequestParam("sandwich") String[] sandwich, Model model) {

        if (sandwich.length == 1) {
            model.addAttribute("message", " Is invalid");
            return "index";

        }else{
        model.addAttribute("sandwich", sandwich);
        return "display";
    }}
}
