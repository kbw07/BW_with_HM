package com.example.demo.practice01.review.controller;

import com.example.demo.practice01.review.model.ReviewDto;
import com.example.demo.practice01.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/review")
@RequiredArgsConstructor
@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/register")
    public ResponseEntity<Integer> register(@RequestBody ReviewDto.Register requestDto) {
        return ResponseEntity.ok(reviewService.register(requestDto));
    }
}
