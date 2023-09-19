package com.assignment.Appointment.API.model;

import com.assignment.Appointment.API.model.enums.Qualification;
import com.assignment.Appointment.API.model.enums.Specialization;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctorId;
    private String doctorName;
    @Enumerated(EnumType.STRING)
    private Specialization specialization;
    private String doctorEmail;
    private String doctorPassword;
    private String doctorAddress;
    private String doctorPinCode;
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
}
