package com.example.demo.practice01.book.repository;

import com.example.demo.practice01.book.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
