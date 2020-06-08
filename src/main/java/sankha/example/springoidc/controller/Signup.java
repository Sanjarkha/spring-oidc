package sankha.example.springoidc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Signup {

    @RequestMapping({"/signup.html","/signup"})
    public String signup(Model model){

        return ("signup");
    }
}
