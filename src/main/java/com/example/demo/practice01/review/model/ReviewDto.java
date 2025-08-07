package com.example.demo.practice01.review.model;

import com.example.demo.practice01.book.model.BookEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ReviewDto {

    @Getter
    @NoArgsConstructor
    public static class Register {

        private String content;
        private Integer score;
        private Integer bookIdx;

        public Review toEntity(BookEntity book) {
            return Review.builder()
                    .content(content)
                    .score(score)
                    .book(book)
                    .build();
        }
    }

    @Getter
    @Builder
    public static class ReviewResponse {

        private Integer idx;
        private String content;
        private Integer score;

        public static ReviewResponse toDto(Review entity) {
            return ReviewResponse.builder()
                    .idx(entity.getIdx())
                    .content(entity.getContent())
                    .score(entity.getScore())
                    .build();
        }
    }
}
