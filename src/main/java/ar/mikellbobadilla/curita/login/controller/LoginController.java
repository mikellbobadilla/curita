package ar.mikellbobadilla.curita.login.controller;

import ar.mikellbobadilla.curita.login.dto.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String loginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "views/login";
    }
}
