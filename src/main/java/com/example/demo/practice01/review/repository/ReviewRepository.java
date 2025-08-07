package com.example.demo.practice01.review.repository;


import com.example.demo.practice01.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
