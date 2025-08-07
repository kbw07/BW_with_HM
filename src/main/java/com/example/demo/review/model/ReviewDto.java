package com.example.demo.review.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ReviewDto {

    @Getter
    @NoArgsConstructor
    public static class Register {

        private String content;
        private Integer score;

        public Review toEntity(Book book) {
            return Review.builder()
                    .content(this.content)
                    .score(this.score)
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

        public ReviewResponse toDto(Review entity) {
            return ReviewResponse.builder()
                    .idx(entity.getIdx())
                    .content(entity.getContent())
                    .score(entity.getScore())
                    .build();
        }
    }
}
