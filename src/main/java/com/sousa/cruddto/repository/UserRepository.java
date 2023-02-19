package com.sousa.cruddto.repository;

import com.sousa.cruddto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
