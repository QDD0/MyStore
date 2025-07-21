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

    @RequestMapping("womenClothes/dresses")
    public String Dresses(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "womenClothes/dresses";
    }

    @RequestMapping("womenClothes/shirts")
    public String shirts(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "womenClothes/shirts";
    }

    @RequestMapping("womenClothes/shorts")
    public String shorts(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "womenClothes/shorts";
    }

    @RequestMapping("/womenClothes/swimsuits")
    public String swimsuit(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "/womenClothes/swimsuits";
    }

    @RequestMapping("/womenClothes/shoes")
    public String shoes(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "/womenClothes/shoes";
    }

    @RequestMapping("/womenClothes/vacation")
    public String vacation(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String displayName = "login";

        if (auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getName())) {
            displayName = auth.getName();
        }

        model.addAttribute("username", displayName);
        return "/womenClothes/vacation";
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
