package com.example.demo.repository;

import com.example.demo.models.Substcriptions;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select s from User s where userName=?1")
    public User findByUserName(@Param("userName") String userName);
}
