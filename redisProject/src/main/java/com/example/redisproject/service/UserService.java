package com.example.redisproject.service;

import com.example.redisproject.model.User;
import com.example.redisproject.dataAccess.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }

    public String deleteUser(Long id){
        userRepository.deleteById(id);
        return "silindi";
    }
}
