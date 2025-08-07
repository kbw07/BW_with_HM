package com.example.demo.study.book.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String title;
    private Integer totalPages;
    private Integer price;

    @OneToMany(mappedBy = "ReviewEntity")
    private List<ReviewEntity> reviewEntity;

}
