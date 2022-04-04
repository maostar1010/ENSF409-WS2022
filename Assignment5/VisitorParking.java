package edu.ucalgary.ensf409;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class VisitorParking {
	public VisitorParking(String license) throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
	public VisitorParking(String license, LocalDate date) throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
	public VisitorParking() {
		
	}
	public void addVisitorReservation(String license) throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
	public void addVisitorReservation(String license, LocalDate date) throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
	public boolean licenceIsRegisteredForDate(String license, LocalDate tmp) {
		return true;
	}
	public boolean licenceIsRegisteredForDate(String license) {
		return true;
	}
	public ArrayList<String> getLicencesRegisteredForDate() {
		return new ArrayList<String>(1);	
	}
	public ArrayList<String> getLicencesRegisteredForDate(LocalDate date) {
		return new ArrayList<String>(1);	
	}
	public ArrayList<LocalDate> getAllDaysLicenceIsRegistered(String license) {
		return new ArrayList<LocalDate>(1);
	}
	public ArrayList<LocalDate> getStartDaysLicenceIsRegistered(String license) {
		return new ArrayList<LocalDate>(1);
	}
	
	// Bonus Part
	public HashMap<String, TreeSet<LocalDate>> getParkingRecord() {
		return new HashMap<String, TreeSet<LocalDate>>(1);
	}
}