package com.app.pojos;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	private LocalDate date;
	private String time;
	
	@ManyToOne
	@JoinColumn(name="p_id") //To replace hibenrate generated FK col name by our own
	private Patient booking;
	
	private String doctorName;
//	@Enumerated(EnumType.STRING)
	private String reason;
	public Booking(Integer bookingId, LocalDate date, String time, Patient booking, String doctorName, String reason) {
		super();
		this.bookingId = bookingId;
		this.date = date;
		this.time = time;
		this.booking = booking;
		this.doctorName = doctorName;
		this.reason = reason;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Patient getBooking() {
		return booking;
	}
	public void setBooking(Patient booking) {
		this.booking = booking;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", date=" + date + ", time=" + time + ", doctorName=" + doctorName
				+ ", reason=" + reason + "]";
	}


	
	
}
