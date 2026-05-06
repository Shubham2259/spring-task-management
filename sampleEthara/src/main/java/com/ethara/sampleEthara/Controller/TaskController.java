package com.ethara.sampleEthara.Controller;

import com.ethara.sampleEthara.entity.Task;
import com.ethara.sampleEthara.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
    @Autowired
    private TaskRepo taskrepo;
    @PostMapping("/addTask")
    public String addTask(Task task){
        taskrepo.save(task);
        return "redirect:/dashboard";
    }
}
