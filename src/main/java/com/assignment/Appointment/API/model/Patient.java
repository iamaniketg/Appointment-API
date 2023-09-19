package com.assignment.Appointment.API.model;

import com.assignment.Appointment.API.model.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;
    private String patientName;
    private String patientEmail;
    private String patientPassword;
    private String patientAddress;
    private String patientPinCode;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
