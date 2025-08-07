package com.example.demo.practice01.book.service;

import com.example.demo.practice01.book.model.BookDto;
import com.example.demo.practice01.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final ReviewRepository reviewRepository;

    public void register(BookDto.Register dto){
        BookDto.Register entity = bookRepository.save(dto.toEntity());

        for(ReviewDto.Register reviewDto : dto.getReviewList()){
            reviewRepository.save(reviewDto.toEntity(entity));
        }
    }

}
