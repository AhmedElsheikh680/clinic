package com.clinic.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NewPatientDto {

    private String name;

    private int age;

    private String gender;

    private String address;

    private String disease;
    private LocalDate date;
    private int hour;

    private Boolean cancle=false;

    private String reason;
}
