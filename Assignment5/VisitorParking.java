package edu.ucalgary.ensf409;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
// import java.time.ZoneId;
// import java.util.TimeZone;

public class VisitorParking {
    // private 
    private HashMap<String, TreeSet<LocalDate>> parking = new HashMap<String, TreeSet<LocalDate>>();
    private LocalDate today = LocalDate.now();

	public VisitorParking(String license) throws IllegalArgumentException {
		Parking.standardizeAndValidateLicence(license);
        // throw new IllegalArgumentException();
	}

	public VisitorParking(String license, LocalDate date) throws IllegalArgumentException {
		Parking.standardizeAndValidateLicence(license);
        if (date.isBefore(today)){
            throw new IllegalArgumentException();
        }
        // throw new IllegalArgumentException();
	}

	public VisitorParking() {}

	public void addVisitorReservation(String license) throws IllegalArgumentException {
		addVisitorReservation(license, today);
        
        // license = Parking.standardizeAndValidateLicence(license);
        
        // if (!parking.containsKey(license)){
        //     TreeSet<LocalDate> reserveDate = new TreeSet<LocalDate>();
        //     reserveDate.add(today);
        //     this.parking.put(license, reserveDate);
        // // } else if (!parking.get(license).contains(date)){
        // //     this.parking.get(license).add(date);
        // } else {
        //     throw new IllegalArgumentException();
        // }

        // // throw new IllegalArgumentException();
	}
    
	public void addVisitorReservation(String license, LocalDate date) throws IllegalArgumentException {
		license = Parking.standardizeAndValidateLicence(license);
        if (date.isBefore(today)){
            throw new IllegalArgumentException();
        }
        if (this.parking.containsKey(license)){
            throw new IllegalArgumentException();
        // } else if (!this.parking.get(license).contains(date)){
        //     this.parking.get(license).add(date);
        } //else {
        //     throw new IllegalArgumentException();
        // }

        // ensuring only two visitor permits are added for one day
        int count0 = 0; // counts how many cars are registered for a day
        int count1 = 0;
        int count2 = 0;
        this.parking.forEach((key, value) -> {
            if (value.contains(date)) {
                count0++;
            } else if (value.contains(date.minusDays(1))) {
                count1++;
            } else if (value.contains(date.minusDays(2))) {
                count2++;
                // if (value.contains(date) || value.contains(date.minusDays(1)) || value.contains(date.minusDays(2))){
                //    throw IllegalArgumentException();
                // }
            }
        });
        if (count0 == 2 || count1 == 2 || count2 == 2){
            throw new IllegalArgumentException();
        } else {
            TreeSet<LocalDate> reserveDate = new TreeSet<LocalDate>();
            reserveDate.add(date);
            this.parking.put(license, reserveDate);
        }
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