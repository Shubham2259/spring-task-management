package com.ethara.sampleEthara.Controller;

import com.ethara.sampleEthara.entity.Project;
import com.ethara.sampleEthara.entity.User;
import com.ethara.sampleEthara.repository.ProjectRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {
    @Autowired
    private ProjectRepo projectrepo;

    @PostMapping("/addProject")
    public String addProject(Project project){
        projectrepo.save(project);
        return "redirect:/dashboard";
    }
}
