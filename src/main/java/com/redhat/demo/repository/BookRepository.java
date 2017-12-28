package com.redhat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redhat.demo.book.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
