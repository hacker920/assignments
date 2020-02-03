package com.example.demo.controllers;

import com.example.demo.models.Substcriptions;
import com.example.demo.repository.SubscriptionRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionsController {
    @Autowired
    SubscriptionRepository subscriptionRepository;
    @PostMapping("/subscribe")
    public Substcriptions subscribe(@RequestBody Substcriptions substcriptions){
        return subscriptionRepository.save(substcriptions);
    }
    @DeleteMapping("/unsubscribe/{id}")
    public boolean unsSubscribe(@PathVariable(value = "id") long id){
         subscriptionRepository.deleteById(id);
         return true;
    }
    @GetMapping("/subscription_list")
    public List<Substcriptions> subscriptionList(){
        return subscriptionRepository.findAll();
    }

    @GetMapping("/userSubscription/{id}")
    public List<Substcriptions> userSubscriptionById(@PathVariable(value = "id") long userId){
        return subscriptionRepository.findSubscriptionsByUserId(userId);
   }
    @GetMapping("/newspaperSubscription/{id}")
    public List<Substcriptions> newspaperSubscriberById(@PathVariable(value = "id") long userId){
        return subscriptionRepository.findSubscriptionsByNewspaperId(userId);
    }


}
