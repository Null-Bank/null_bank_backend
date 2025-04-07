package com.null_bank_backend.NullBank.dto.user;

import com.null_bank_backend.NullBank.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    private ModelMapper userMapper;

    public User toEntity(UserRequestDTO dto) {
        return  userMapper.map(dto, User.class);
    }

    public UserResponseDTO toDto(User entity) {
        return userMapper.map(entity, UserResponseDTO.class);
    }
}
