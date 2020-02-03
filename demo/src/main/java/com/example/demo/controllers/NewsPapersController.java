package com.example.demo.controllers;

import com.example.demo.models.NewsPapers;
import com.example.demo.repository.NewspaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class NewsPapersController {
    @Autowired
    NewspaperRepository newspaperRepository;
    @PostMapping("/newspapers")
    public void addPaper(@RequestBody NewsPapers newspaper){
        newspaperRepository.save(newspaper);
        System.out.println("newspaper added");
    }
    @GetMapping("/newspapers")
    public List<NewsPapers> findAllPaper(){
        return newspaperRepository.findAll();
    }
    @GetMapping("/newspapers/{id}")
    public NewsPapers findPaperById(@PathVariable(value = "id") long id) throws Exception{
        return newspaperRepository.findById(id).orElseThrow(Exception::new);
    }
}
