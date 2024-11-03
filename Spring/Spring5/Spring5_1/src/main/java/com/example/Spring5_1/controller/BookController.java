package com.example.Spring5_1.controller;


import com.example.Spring5_1.model.Book;
import com.example.Spring5_1.serivces.BookService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }


}
