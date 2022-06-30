package com.clinic.repo;

import com.clinic.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Set;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

    public Set<Appointment> findByDate(LocalDateTime date);
}
