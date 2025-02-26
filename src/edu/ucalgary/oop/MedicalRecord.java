package edu.ucalgary.oop;

import java.util.regex.*;

public class MedicalRecord {
	private Location location;
	private String treatmentDetails;
	private String dateOfTreatment;
	
	public MedicalRecord(Location location, String treatmentDetails,
			String dateOfTreatment) throws IllegalArgumentException {
		if(!isValidDateFormat(dateOfTreatment)) {
			throw new IllegalArgumentException("Not a valid date format. "
					+ "Please enter a date in the form yyyy-MM-dd");
		} else {
		this.location = location;
		this.treatmentDetails = treatmentDetails;
		this.dateOfTreatment = dateOfTreatment;
		}
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getTreatmentDetails() {
		return treatmentDetails;
	}

	public void setTreatmentDetails(String treatmentDetails) {
		this.treatmentDetails = treatmentDetails;
	}

	public String getDateOfTreatment() {
		return dateOfTreatment;
	}

	public void setDateOfTreatment(String dateOfTreatment) {
		if(!isValidDateFormat(dateOfTreatment)) {
			throw new IllegalArgumentException("Not a valid date format. "
					+ "Please enter a date in the form yyyy-MM-dd");
		} else {
		this.dateOfTreatment = dateOfTreatment;
		}
	}
	
	private boolean isValidDateFormat(String date) {
		Pattern datePattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher match = datePattern.matcher(date);
		if(match.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
}
