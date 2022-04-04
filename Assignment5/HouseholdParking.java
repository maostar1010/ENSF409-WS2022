/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.ensf409;
import java.time.LocalDate;
import java.util.*;

public class HouseholdParking extends CalgaryProperty {
    // Each residential property is allowed one street parking permit
    private LinkedList<String> residentLicence = new LinkedList<String>();
    private int maxLicences = 3;

    public HouseholdParking(int taxRollNumber, String zoning, String streetName, int buildingNumber, String postCode, String buildingAnnex) throws IllegalArgumentException {
        super(taxRollNumber,zoning,streetName,buildingNumber,postCode,buildingAnnex);
    }

    public HouseholdParking(int taxRollNumber, String zoning, String streetName, int buildingNumber, String postCode) throws IllegalArgumentException {
        super(taxRollNumber,zoning,streetName,buildingNumber,postCode);
    }

    /*
     * Add a license to the first empty spot in residentLicence, or replace the most recent
     * Ignore if the license is already stored
     * @param licence - The license plate to be added
     * @throws IllegalArgumentException if licence plate isn't a valid Alberta licence
    */
    public void addOrReplaceResidentLicence(String licence) throws IllegalArgumentException {
        licence = Parking.standardizeAndValidateLicence(licence);
        int len = residentLicence.size();

        // If licence is already in the list, don't continue
        for (String val : residentLicence) {
            if (val.equals(licence)) {
                return;
            }
        }

        // If fewer than three are stored, add to list
        if (len < maxLicences) {
            residentLicence.add(licence);
 
        // If more than three are stored, replace last in list
        } else {
            this.residentLicence.set(maxLicences-1, licence);
        }
    }

    /*
     * Remove all listed licences
     * @return whether the operation succeeded or not
    */
    public boolean removeResidentLicence() {
        this.residentLicence.clear();
        return true;
    }

    /*
     * Remove a specific listed licence 
     * @param licence - the licence to be removed
     * @return whether the operation succeeded or not
    */
    public boolean removeResidentLicence(String licence) {
        // Standardize the licence name. If it is invalid, it can't exist so return false.
        try {
            licence = Parking.standardizeAndValidateLicence(licence);
        }
        catch (Exception e) {
            return false;
        }

        for (int i=0; i < this.residentLicence.size(); i++) {
            if (licence.equals(this.residentLicence.get(i))) {
                this.residentLicence.remove(i);
                return true;
            }
        }

        // Couldn't find entry
        return false;
    }
        
    /*
     * Get all the licences stored for the resident
     * @return An array containing the resident's licences
    */
   
    public String getResidentLicence() {
//       String result[] = this.residentLicence.toArray(new String[maxLicences]);
//       return result;
    	return "";
    }
    
    public VisitorParking getVisitors() {
    	return new VisitorParking();
    }
    
    public void addVisitorReservation(String license) {
    	
    }
    
    public void addVisitorReservation(String license, LocalDate date) {
    	
    }
    public ArrayList<String> getLicencesRegisteredForDate() {
    	return new ArrayList<String>(1);
    }
    public ArrayList<String> getLicencesRegisteredForDate(LocalDate date) {
    	return new ArrayList<String>(1);
    }
    public boolean licenceIsRegisteredForDate(String license) {
    	return true;
    }
    public boolean licenceIsRegisteredForDate(String license, LocalDate date) {
    	return true;
    }
    public ArrayList<LocalDate> getAllDaysLicenceIsRegistered(String license){
    	return new ArrayList<LocalDate>(1);
    }
    public ArrayList<LocalDate> getStartDaysLicenceIsRegistered(String license){
    	return new ArrayList<LocalDate>(1);
    }
}