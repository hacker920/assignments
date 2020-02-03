package com.example.demo.repository;

import com.example.demo.models.NewsPapers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewspaperRepository extends JpaRepository<NewsPapers,Long> {
}
