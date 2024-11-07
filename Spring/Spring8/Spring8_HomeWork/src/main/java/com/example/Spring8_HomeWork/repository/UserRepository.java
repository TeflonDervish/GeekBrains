package com.example.Spring8_HomeWork.repository;


import com.example.Spring8_HomeWork.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
