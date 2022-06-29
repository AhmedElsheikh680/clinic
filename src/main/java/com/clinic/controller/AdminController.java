package com.clinic.controller;

import com.clinic.model.Appointment;
import com.clinic.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class AdminController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/")
    public Set<Appointment> appointments() {
        return appointmentService.appointments();
    }

}
