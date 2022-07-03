package com.clinic.service;


import com.clinic.dto.NewPatientDto;
import com.clinic.mapper.NewPatientMapper;
import com.clinic.model.Appointment;
import com.clinic.model.Patient;
import com.clinic.repo.AppointmentRepo;
import com.clinic.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private PatientRepo patientRepo;
    public Set<Appointment> appointments() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        return appointmentRepo.findByDate(date);
    }
    public  Patient addPatient(NewPatientDto newPatientDto) {
        Appointment appointment = NewPatientMapper.newPatientDtoToAppointment(newPatientDto);
        Patient patient = NewPatientMapper.newPatientDtoToPatient(newPatientDto);

        appointment.setPatient(patient);
        patient.getAppointments().add(appointment);
        patientRepo.save(patient);
        appointmentRepo.save(appointment);
        System.out.println(appointment.toString());
        System.out.println(patient.toString());
        System.out.println(appointment.getPatient());
        return patient;
    }


    public Appointment getAppointment(int id) {
        return  appointmentRepo.findById(id).get();
    }
    public Appointment cancleAppointment(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }


    public Set<Appointment> filterAppointmentByDate(LocalDate date) {

        return appointmentRepo.findByDate(date);
    }

    public Set<Appointment> serchByName(String name) {
        return appointmentRepo.findByPatientName(name);
    }

    public List<Appointment> searchAll() {
        return  appointmentRepo.findAll();
    }














}
