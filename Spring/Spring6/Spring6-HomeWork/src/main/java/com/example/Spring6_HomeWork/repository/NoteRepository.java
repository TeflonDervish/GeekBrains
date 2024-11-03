package com.example.Spring6_HomeWork.repository;

import com.example.Spring6_HomeWork.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
