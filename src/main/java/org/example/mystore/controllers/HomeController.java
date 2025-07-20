package org.example.mystore.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/", "/men"})
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";
        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "men";
    }

    @RequestMapping("/women")
    public String women(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "women";
    }

    @RequestMapping("/kids")
    public String kids(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);

        return "kids";
    }

    @RequestMapping("/shirts")
    public String Tshirts() {
        return "shirts";
    }

    @RequestMapping("/continue")
    public String continued() {
        return "continue";
    }

    @RequestMapping("/login")
    public String login() {
        return "auth/login";
    }
}
