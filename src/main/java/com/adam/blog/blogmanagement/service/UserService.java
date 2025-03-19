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
    public void registerUser(User user){
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

    public boolean updateUserById(User user){
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        if (oldUser == null) {
            return false;
        }

        if (user.getName() != null) oldUser.setName(user.getName());
        if (user.getRole() != null) oldUser.setRole(user.getRole());
        if (user.getEmail() != null) oldUser.setEmail(user.getEmail());
        if (user.getPassword() != null) oldUser.setPassword(user.getPassword());

        userRepository.save(oldUser);
        return true;
    }

    public void deleteUserById(int id){
        userRepository.deleteById(id);
    }
}
