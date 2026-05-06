package com.ethara.sampleEthara.Controller;

import com.ethara.sampleEthara.entity.User;
import com.ethara.sampleEthara.repository.UserRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserRepo userrepo;

    @GetMapping("/signup")
    public String signupPage(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }
    @PostMapping("/signup")
    public String signUp(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if(user.getRole() == null || user.getRole().isEmpty()){
            user.setRole("ADMIN");
//            user.setRole("MEMBER");
        }
        userrepo.save(user);
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("user",new User());
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }
    @Autowired
    private PasswordEncoder passwordEncoder;
}
