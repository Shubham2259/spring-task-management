package com.ethara.sampleEthara.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @GetMapping("/admin/dashboard")
    public String admin() {
        return "Admin only";
    }

    @GetMapping("/member/home")
    public String member() {
        return "Member + Admin";
    }
}
