package com.assignment.Appointment.API.controller;


import com.assignment.Appointment.API.model.Appointment;
import com.assignment.Appointment.API.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;


    @GetMapping("appointments")
    List<Appointment> getAllAppointments()
    {
        return appointmentService.getAllAppointments();
    }
}