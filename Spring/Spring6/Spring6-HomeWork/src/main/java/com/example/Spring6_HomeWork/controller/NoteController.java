package com.example.Spring6_HomeWork.controller;


import com.example.Spring6_HomeWork.model.Note;
import com.example.Spring6_HomeWork.service.NoteService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/notes")
@AllArgsConstructor
public class NoteController {

    private NoteService noteService;

    @PostMapping("/add")
    public Note addNote(@RequestBody Note note){
        return noteService.addNote(note);
    }

    @GetMapping("/all")
    public List<Note> getAllNote(){
        log.info("all");
        return noteService.getAllNotes();
    }

    @PutMapping("/update")
    public Note updateNote(@RequestBody Note note) {
        return noteService.updateNote(note);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }
}
