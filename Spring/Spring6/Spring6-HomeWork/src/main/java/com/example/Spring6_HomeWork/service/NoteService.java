package com.example.Spring6_HomeWork.service;


import com.example.Spring6_HomeWork.model.Note;
import com.example.Spring6_HomeWork.repository.NoteRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class NoteService {

    private NoteRepository noteRepository;

    public Note addNote(Note note){
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public Note updateNote(Note note) {
        return noteRepository.findById(note.getId())
                .map(updatedNote -> {
                    updatedNote.setCaption(note.getCaption());
                    updatedNote.setContents(note.getContents());
                    return noteRepository.save(updatedNote);
                })
                .orElseThrow(null);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
