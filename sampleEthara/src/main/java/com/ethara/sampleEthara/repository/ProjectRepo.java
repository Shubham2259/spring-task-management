package com.ethara.sampleEthara.repository;

import com.ethara.sampleEthara.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Long> {
}
