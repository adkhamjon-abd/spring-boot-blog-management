package com.adam.blog.blogmanagement.service;

import com.adam.blog.blogmanagement.Entity.User;
import com.adam.blog.blogmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private void registerUser(User user){
        userRepository.save(user);
    }

    public User findUserById(int id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    public List<User> findAllUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    public void deleteUserById(int id){
        userRepository.deleteById(id);
    }
}
