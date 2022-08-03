package com.clinic.mapper;


import com.clinic.dto.NewPatientDto;
import com.clinic.model.Appointment;
import com.clinic.model.Patient;

public class NewPatientMapper {

    public static Patient newPatientDtoToPatient(NewPatientDto newPatientDto) {
        Patient patient = new Patient();
        patient.setName(newPatientDto.getName());
        patient.setAge(newPatientDto.getAge());
        patient.setDisease(newPatientDto.getDisease());
        patient.setGender(newPatientDto.getGender());
        patient.setAddress(newPatientDto.getAddress());

        return patient;
    }
    public static Appointment newPatientDtoToAppointment(NewPatientDto newPatientDto) {
        Appointment appointment = new Appointment();
        appointment.setCancle(newPatientDto.getCancle());
        appointment.setDate(newPatientDto.getDate());
        appointment.setHour(newPatientDto.getHour());
        appointment.setReason(newPatientDto.getReason());
        return appointment;
    }
}
