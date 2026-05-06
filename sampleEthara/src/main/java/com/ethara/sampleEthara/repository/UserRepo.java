package com.ethara.sampleEthara.repository;

import com.ethara.sampleEthara.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
