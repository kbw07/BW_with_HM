package com.example.demo.practice01.book.service;

import com.example.demo.practice01.book.model.BookDto;
import com.example.demo.practice01.book.model.BookEntity;
import com.example.demo.practice01.book.repository.BookRepository;
import com.example.demo.practice01.review.model.ReviewDto;
import com.example.demo.practice01.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Integer register(BookDto.Register dto){
        BookEntity book = bookRepository.save(dto.toEntity());
        return book.getIdx();
    }

}
