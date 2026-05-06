package com.ethara.sampleEthara.Controller;

import com.ethara.sampleEthara.entity.Task;
import com.ethara.sampleEthara.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskApiController {
    @Autowired
    private TaskRepo repo;
    @GetMapping
    public List<Task> getAll(){
        return repo.findAll();
    }
}
