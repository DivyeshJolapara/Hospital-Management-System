package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Booking;


public interface IBookingRepo extends JpaRepository<Booking, Integer>  {
	

}
