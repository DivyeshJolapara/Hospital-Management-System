package com.app.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IBookingRepo;
import com.app.dao.IPatientRepo;
import com.app.pojos.Booking;
import com.app.pojos.Patient;

@Service
@Transactional
public class PatientServiceImpl implements IPatientService{

	@Autowired
	private IPatientRepo repo;
	@Autowired
	private IBookingRepo bookingRepo;
	@Override
	public List<Patient> getAllPatient() {
		return repo.findAll();
		
	}
	@Override
	public List<Patient> getPatientsByEmailAndPassword(String p_email, String p_password) {
		
			return repo.findByEmailAndPassword(p_email,p_password);
	}
	@Override
	public Patient savePatientDetails(Patient p) {
		Patient patient = repo.save(p);// patient : DETACHED : insert
		patient.setName(patient.getName().toUpperCase());
		return patient;
	}
	@Override
	public Booking bookAppointment(Booking b) {
		Booking bookPatient =bookingRepo.save(b);
		
		return bookPatient;
	}
	
	
	
}
