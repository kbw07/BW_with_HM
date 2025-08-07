package com.example.demo.practice01.book.model;


import lombok.Getter;

public class BookDto {
    //    @Getter
//    @Builder
//    public static class BookRes {
//        private Integer idx;
//        private String title;
//        private Integer totalPages;
//        private Integer price;
//        private List<ReviewDto.ReviewRes> reviewResList;
//
//        public static BookRes from(BookEntity entity) {
//            BookRes dto = BookRes.builder()
//                    .idx(entity.getIdx())
//                    .title(entity.getTitle())
//                    .totalPages(entity.getTotalPages())
//                    .price(entity.getPrice())
//                    .reviewResList(entity.getReviewList().stream().map(ReviewDto.Register::from).toList())
//                    .build();
//            return dto;
//        }
//    }
    @Getter
    public static class Register {

        private String title;
        private Integer totalPages;
        private Integer price;

        public BookEntity toEntity() {
            BookEntity entity = BookEntity.builder()
                    .title(title)
                    .totalPages(totalPages)
                    .price(price)
                    .build();
            return entity;
        }
    }
}
