package com.example.demo.repository;

import com.example.demo.models.Substcriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Substcriptions,Long> {
    @Query("select s from Substcriptions s where userId=?1")
    public List<Substcriptions> findSubscriptionsByUserId(@Param("id") long id);
    @Query("select s from Substcriptions s where newspaperId=?1")
    public List<Substcriptions> findSubscriptionsByNewspaperId(@Param("id") long id);
}
