package com.example.Spring8_HomeWork.service;


import com.example.Spring8_HomeWork.Aspect.TrackUser;
import com.example.Spring8_HomeWork.model.Users;
import com.example.Spring8_HomeWork.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @TrackUser
    public Users createUser(String username, String password) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);

    }

    @TrackUser
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
