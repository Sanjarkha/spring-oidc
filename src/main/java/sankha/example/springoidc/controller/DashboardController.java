package sankha.example.springoidc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
    private String name="Sanjar Kha";
    private String authorities="google.com";
    private String login="Sanjar50";
    private String email="sanjar@gmail.com";
    private String phone="+998930025056";

    @RequestMapping({"/dashboard","/dashboard.html"})
    public String dashboard(Model model){
        model.addAttribute("name",name);
        model.addAttribute("authorities",authorities);
        model.addAttribute("login",login);
        model.addAttribute("email", email);
        model.addAttribute("phone",phone);
        return "dashboard";
    }
}
