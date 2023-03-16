package com.pshakhlovich.jmp.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    private Long id;
    private String name;
    private String surname;
    private String birthday;
}
