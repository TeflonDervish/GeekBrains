package com.example.Spring6_1.controller;


import com.example.Spring6_1.model.Reader;
import com.example.Spring6_1.repository.ReaderRepository;
import lombok.AllArgsConstructor;
import lombok.Locked;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@AllArgsConstructor
public class ReaderController {

    private final ReaderRepository readerRepository;

    @GetMapping
    public List<Reader> getAll(){
        return readerRepository.findAll();
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader){
        return readerRepository.save(reader);
    }
}
