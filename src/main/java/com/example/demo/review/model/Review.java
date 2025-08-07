package com.example.demo.review.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    private String content;

    private Integer score;

    @ManyToOne
    @JoinColumn(name = "book_idx")
    private Book book;
}
