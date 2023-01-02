package org.sarsandi.rajeev.validationdemo.controller;

import jakarta.validation.Valid;
import org.sarsandi.rajeev.validationdemo.dto.UserRequest;
import org.sarsandi.rajeev.validationdemo.entity.User;
import org.sarsandi.rajeev.validationdemo.exception.UserNotFoundException;
import org.sarsandi.rajeev.validationdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<User> saveUserRequest(@RequestBody @Valid UserRequest userRequest) {

        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);

    }

    @GetMapping("/fetch")
    public ResponseEntity<List<User>> fetchUserRequest() {

        return ResponseEntity.ok(userService.fetchAllUser());

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> fetchUserByID(@PathVariable int id) throws UserNotFoundException {

        return ResponseEntity.ok(userService.fetchUserByID(id));

    }
}
