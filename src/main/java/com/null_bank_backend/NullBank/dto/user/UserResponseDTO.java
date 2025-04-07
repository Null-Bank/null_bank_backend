package com.null_bank_backend.NullBank.dto.user;

import java.util.Calendar;

public record UserResponseDTO(
        Long id,
        String name,
        Calendar dateOfBirth,
        String email,
        String phone,
        Double balance
) {}
