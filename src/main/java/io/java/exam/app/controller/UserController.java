package io.java.exam.app.controller;

import io.java.exam.app.model.User;
import io.java.exam.app.service.UserService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable(value="id") Integer id){
            return ResponseEntity.ok(userService.getUser(id));
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value="id") Integer id, @RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value="id") Integer id){
        return ResponseEntity.ok().build();
    }
}
