package com.post.post.services;

import com.post.post.model.User;
import com.post.post.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public User addUser(String name)
    {
        return userRepo.save(new User(name));

    }
    public User getUserById(int userId)
    {
        return userRepo.findByUserId(userId);

    }
}
