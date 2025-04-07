package com.null_bank_backend.NullBank.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;

@Getter
@Setter
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Calendar dateOfBirth;
    private String cpf;
    private String email;
    private String phone;
    private String password;
    private Double balance;


}
