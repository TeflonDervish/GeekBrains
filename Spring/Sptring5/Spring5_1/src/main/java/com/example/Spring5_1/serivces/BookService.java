package com.example.Spring5_1.serivces;


import com.example.Spring5_1.model.Book;
import com.example.Spring5_1.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);
    }

    public Book createBook(Book book) {
        return repository.save(book);
    }

    public Book updateBook(Long id, Book newBook) {
        Optional<Book> optionalBook = repository.findById(id);
        if (optionalBook.isPresent()){
            Book book = optionalBook.get();
            book.setTitle(newBook.getTitle());
            book.setAuthor(newBook.getAuthor());
            book.setPublishedYear(newBook.getPublishedYear());
            return repository.save(book);
        }else {
            throw new IllegalArgumentException("Book not found by id:" + id);
        }
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

}
