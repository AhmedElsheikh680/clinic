package com.clinic.service;


import com.clinic.model.Appointment;
import com.clinic.repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    public Set<Appointment> appointments() {
        Date myDate = new Date();
        return appointmentRepo.findByMyDate(myDate);
    }

}
