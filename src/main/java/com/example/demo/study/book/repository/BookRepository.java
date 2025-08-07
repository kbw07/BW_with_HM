package com.example.demo.study.book.repository;

import com.example.demo.study.book.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {

}
