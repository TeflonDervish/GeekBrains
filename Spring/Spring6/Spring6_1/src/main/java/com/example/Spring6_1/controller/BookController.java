package com.example.Spring6_1.controller;


import com.example.Spring6_1.model.Book;
import com.example.Spring6_1.model.Reader;
import com.example.Spring6_1.repository.BookRepository;
import com.example.Spring6_1.repository.ReaderRepository;
import lombok.AllArgsConstructor;
import lombok.Locked;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    private final ReaderRepository readerRepository;


    @GetMapping
    private List<Book> getAll(){
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}/{reader}/{readerId}")
    public ResponseEntity<Book> assignReaderToBook(@PathVariable Long id, @PathVariable Long readerId){
        Optional<Book> bookOptional = bookRepository.findById(id);
        Optional<Reader> readerOptional = readerRepository.findById(id);

        if (bookOptional.isPresent() && readerOptional.isPresent()){
            Book book = bookOptional.get();
            Reader reader = readerOptional.get();
            book.setReader(reader);
            bookRepository.save(book);
            return ResponseEntity.ok(book);
        }else {
            return ResponseEntity.notFound().build();
        }
    }



}
