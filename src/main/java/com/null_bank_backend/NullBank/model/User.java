package com.null_bank_backend.NullBank.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;

@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private Calendar dateOfBirth; // Calendar é mais atualizado, tipo Date tá depreciado
    private String CPF;
    private String email;
    private String phone;
    private String password;
    private Double balance;

}
