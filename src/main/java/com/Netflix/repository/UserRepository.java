package com.Netflix.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.Netflix.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
