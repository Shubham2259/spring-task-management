package com.ethara.sampleEthara.Controller;

import com.ethara.sampleEthara.repository.TaskRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class DashboardController {
    @Autowired
    private TaskRepo repo;
    @GetMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("tasks", repo.findAll());

        long completed = repo.findAll().stream()
                .filter(t -> "DONE".equals(t.getStatus()))
                .count();

        long overdue = repo.findAll().stream()
                .filter(t -> t.getDueDate() != null &&
                        t.getDueDate().isBefore(LocalDate.now()) &&
                        !"DONE".equals(t.getStatus()))
                .count();

        model.addAttribute("completed", completed);
        model.addAttribute("overdue", overdue);

        return "dashboard";
    }
}
