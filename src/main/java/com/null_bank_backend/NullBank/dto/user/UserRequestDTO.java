package com.null_bank_backend.NullBank.dto.user;

import java.util.Calendar;

public record UserRequestDTO(
        String name,
        Calendar dateOfBirth,
        String cpf,
        String email,
        String phone,
        String password
) {}
