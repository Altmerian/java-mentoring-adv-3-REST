package com.pshakhlovich.jmp.bo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {

    public User(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    private Long id;
    private String name;
    private String surname;
    private LocalDate birthday;
}
