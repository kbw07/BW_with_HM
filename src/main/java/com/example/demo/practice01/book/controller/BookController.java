package com.example.demo.practice01.book.controller;

import com.example.demo.practice01.book.model.BookDto;
import com.example.demo.practice01.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity register(@RequestBody BookDto.Register dto) {
        bookService.register(dto);

        return ResponseEntity
                .status(200)
                .body("책 등록 성공");
    }
}
