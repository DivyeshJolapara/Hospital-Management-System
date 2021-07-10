package com.app.service;

import java.util.List;

import com.app.pojos.Booking;
import com.app.pojos.Patient;

public interface IPatientService {

	List<Patient> getAllPatient();

	List<Patient> getPatientsByEmailAndPassword(String p_email, String p_password);

	Patient savePatientDetails(Patient p);

	Booking bookAppointment(Booking b);

}
