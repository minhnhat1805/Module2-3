package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    @GetMapping(value = "/caculator")
    public String show() {
        return "display";
    }

    @RequestMapping(        "/caculator")
    private String caculator(@RequestParam(defaultValue = "choose") String choose, @RequestParam("first") float first, @RequestParam("second") float second, Model model) {
        float resufl;
        switch (choose) {
            case "Addition(+)": {
                resufl= first + second;
                model.addAttribute("message", " Resufl Addition:" + resufl);
                break;
            }
            case "Subtraction(-)": {
                resufl = first - second;
                model.addAttribute("message", "Resufl Sutraction:" + resufl);
                break;
            }
            case "Multiplication(X)": {
                resufl = first * second;
                model.addAttribute("message", "Resufl Multiplication:" + resufl);
                break;
            }
            case "Division(/)": {
                resufl = first / second;
                model.addAttribute("message", "Resufl Division:" + resufl);
                break;
            }
            default:{
                model.addAttribute("message","Error");
            }
        }
        return "display";
    }
}
