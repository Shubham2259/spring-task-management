package com.ethara.sampleEthara.repository;

import com.ethara.sampleEthara.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {

}
