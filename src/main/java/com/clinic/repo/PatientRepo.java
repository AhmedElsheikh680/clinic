package com.clinic.repo;

import com.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
