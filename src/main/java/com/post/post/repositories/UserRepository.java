package com.post.post.repositories;

import com.post.post.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int userId);
    List<User> findByName(String name);
}

