package sankha.example.springoidc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping({"","/login","/login.html"})
    public String login(){
        return "login";
    }
}
