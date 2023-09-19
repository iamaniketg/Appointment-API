package com.assignment.Appointment.API.repository;


import com.assignment.Appointment.API.model.Appointment;
import com.assignment.Appointment.API.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {

    Appointment findFirstByPatient(Patient patient);
}