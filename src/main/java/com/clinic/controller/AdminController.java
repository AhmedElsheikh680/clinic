package com.clinic.controller;

import com.clinic.dto.NewPatientDto;
import com.clinic.model.Appointment;
import com.clinic.model.Cancellation;
import com.clinic.model.Patient;
import com.clinic.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
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

    @PostMapping("/add-patient")
    public Patient addPatient(@RequestBody NewPatientDto newPatientDto) {
        return appointmentService.addPatient(newPatientDto);
    }

    @PutMapping("/cancle-appointment")
    public Appointment cancleAppointment(@RequestBody Cancellation cancellation) {
        Appointment appointment = appointmentService.getAppointment(cancellation.getId());
        appointment.setReason(cancellation.getReason());
        appointment.setCancle(true);
        appointmentService.cancleAppointment(appointment);
        return appointment;
    }

    @GetMapping("/date")
    public Set<Appointment> filterAppointmentByDate(@RequestParam String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return  appointmentService.filterAppointmentByDate(localDate);
    }

    @GetMapping("/search-by-name")
    public Set<Appointment> serchByName(@RequestParam String name) {

        return  appointmentService.serchByName(name);
    }
    @GetMapping("/search-all")
    public List<Appointment> serchAll() {

        return  appointmentService.searchAll();
    }





















}
