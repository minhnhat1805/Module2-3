package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Translate {
    @GetMapping("/")
    public String English(){
     return "input";
    }
    @PostMapping("/translate")

 public String English(@RequestParam("english") String english, Model model) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String vietnamese = dictionary.get(english);
        model.addAttribute("english",english);
        model.addAttribute("vietnamese",vietnamese);
        return "output";

    }

  /*  public String English(@RequestParam("english") String english, Model model){
        String vietnamese = null;

        switch (english) {
            case "banana": {
                vietnamese = "CHUOI";
                break;
            }
            case "apple": {
                vietnamese = "TAO";
                break;
            }
            case "water":{
                vietnamese="NUOC";
                break;
            }
            default:
                break;

        }
        model.addAttribute("english",english);
        model.addAttribute("vietnamese",vietnamese);
        return "output";
        }*/
    }

