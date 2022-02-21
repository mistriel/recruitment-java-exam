package io.java.exam.app.service;

import io.java.exam.app.model.User;
import io.java.exam.app.repository.UserRepository;
import lombok.Data;

import java.util.List;

@Data
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUser(Integer id){
        return userRepository.findById(id)
                .orElse(null);
    }

    public User updateUser(Integer id, User user){
        return userRepository.save(user);
    }

    public void deleteUser(Integer id){
         userRepository.deleteById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
