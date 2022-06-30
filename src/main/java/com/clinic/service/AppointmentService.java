package com.clinic.service;


import com.clinic.model.Appointment;
import com.clinic.repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Set;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    public Set<Appointment> appointments() {
        //LocalDateTime myDate =  LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(
                2020, 01, 01, 10, 10, 10, 000000);
        return appointmentRepo.findByDate(localDateTime);
    }

}
