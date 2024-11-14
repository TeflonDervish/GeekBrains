package ru.semenov.Spring10_HomeWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.semenov.Spring10_HomeWork.model.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
