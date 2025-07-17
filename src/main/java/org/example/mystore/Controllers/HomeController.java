package org.example.mystore.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/", "/men"})
    public String home() {
        return "men";
    }

    @RequestMapping("/women")
    public String women() {
        return "women";
    }
}
