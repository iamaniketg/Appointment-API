package com.assignment.Appointment.API.service;

import com.assignment.Appointment.API.model.AuthenticationToken;
import com.assignment.Appointment.API.repository.IAuthTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthTokenRepo authTokenRepo;

    public boolean authenticate(String email, String authTokenValue){
        AuthenticationToken authToken = authTokenRepo.findFirstByTokenValue(authTokenValue);

        if(authToken == null){
            return false;
        }

        String tokenConnectedEmail = authToken.getPatient().getPatientEmail();

        return tokenConnectedEmail.equals(email);
    }
}