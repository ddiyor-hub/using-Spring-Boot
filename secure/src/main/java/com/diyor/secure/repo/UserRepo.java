package com.diyor.secure.repo;

import com.diyor.secure.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
