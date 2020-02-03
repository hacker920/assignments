package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/dev")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @PostMapping("/users")
    public User addUser(@Valid @RequestBody User user){
    return    userRepository.save(user);
//        System.out.println("user added");
    }
    @GetMapping("/users")
    public List<User> findAllUser(){
        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable(value = "id") long id) throws Exception{
        return userRepository.findById(id).orElseThrow(Exception::new);
    }
}
