package sankha.example.springoidc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
    @RequestMapping({"/dashboard","/dashboard.html"})
    public String dashboard(){
        return "dashboard";
    }
}
