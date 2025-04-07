package com.null_bank_backend.NullBank.service;

import com.null_bank_backend.NullBank.model.User;
import com.null_bank_backend.NullBank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }
}
