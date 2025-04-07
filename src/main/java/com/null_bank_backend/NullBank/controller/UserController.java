package com.null_bank_backend.NullBank.controller;

import com.null_bank_backend.NullBank.dto.user.*;
import com.null_bank_backend.NullBank.model.User;
import com.null_bank_backend.NullBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserRequestDTO userRequestDTO) {
       User user = userMapper.toEntity(userRequestDTO);
       User registeredUser = userService.register(user);
       UserResponseDTO userResponseDTO = userMapper.toDto(registeredUser);
       return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);
    }

}
