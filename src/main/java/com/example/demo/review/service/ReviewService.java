package com.example.demo.review.service;


import com.example.demo.review.model.Review;
import com.example.demo.review.model.ReviewDto;
import com.example.demo.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReviewService {

    private final BookRepository bookRepository;
    private final ReviewRepository reviewRepository;

    public Integer register(Integer bookIdx, ReviewDto.Register requestDto) {
        Book book = bookRepository.findById(bookIdx)
                .orElseThrow(() -> new IllegalArgumentException("책 없음 bookId=" + bookIdx));

        Review review = requestDto.toEntity(book);

        return reviewRepository.save(review).getIdx();
    }

    public ReviewDto.ReviewResponse read(Integer reviewIdx) {
        Review findReview = reviewRepository.findById(reviewIdx)
                .orElseThrow(() -> new IllegalArgumentException("리뷰 없음 reviewId=" + reviewIdx));

        return ReviewDto.ReviewResponse.toDto(findReview);
    }
}
