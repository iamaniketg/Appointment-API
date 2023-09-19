package com.assignment.Appointment.API.repository;


import com.assignment.Appointment.API.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor,Long> {
}