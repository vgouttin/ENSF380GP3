package edu.ucalgary.oop;

import java.util.regex.*;

public class DisasterVictim {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int ASSIGNED_SOCIAL_ID;
	private FamilyRelation[] familyConnections;
	private MedicalRecord[] medicalRecords;
	private Supply[] personalBelongings;
	private String ENTRY_DATE;
	private String gender;
	private String comments;
	private static int counter;
	
	public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
		if (!isValidDateFormat(ENTRY_DATE)) {
			throw new IllegalArgumentException ("Not a valid date format. "
					+ "Please enter a date in the form yyyy-MM-dd.");
		} else {
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		}
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE,
			String dateOfBirth) throws IllegalArgumentException {
		if (!isValidDateFormat(ENTRY_DATE) || !isValidDateFormat(dateOfBirth)) {
			throw new IllegalArgumentException("Not a valid date format. "
					+ "Please enter a date in the form yyyy-MM-dd.");
		} if(convertDateStringToInt(ENTRY_DATE) < convertDateStringToInt(dateOfBirth)) {
			throw new IllegalArgumentException("Birthday can't be later than date of entry"
					+ "Please enter a new birthday.");
		} else {
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		this.dateOfBirth = dateOfBirth;	
		}
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
		if (!isValidDateFormat(dateOfBirth)) {
			throw new IllegalArgumentException("Not a valid date format. "
					+ "Please enter a date in the form yyyy-MM-dd");
		} else {
			this.dateOfBirth = dateOfBirth;
		}
	} 
		
	public int getAssignedSocialID() {
		return generateSocialId();
	}

	public FamilyRelation[] getFamilyConnections() {
		return familyConnections;
	}

	public void setFamilyConnections(FamilyRelation[] familyConnections) {
		this.familyConnections = familyConnections;
	}

	public MedicalRecord[] getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(MedicalRecord[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public Supply[] getPersonalBelongings() {
		return personalBelongings;
	}

	public void setPersonalBelongings(Supply[] personalBelongings) {
		this.personalBelongings = personalBelongings;
	}
	
	public void addPersonalBelonging(Supply supply) {
		if (this.getPersonalBelongings() == null) {
			setPersonalBelongings(new Supply[0]);	
		}
		Supply[] oldPersonalBelongings = this.getPersonalBelongings();
		Supply[] newPersonalBelongings = new Supply[oldPersonalBelongings.length + 1];
		int i;
		for(i = 0; i < oldPersonalBelongings.length; i++) {
			newPersonalBelongings[i] = oldPersonalBelongings[i];
		}
		
		newPersonalBelongings[i] = supply;
		setPersonalBelongings(newPersonalBelongings);
	}
	
	public void removePersonalBelonging(Supply unwantedSupply) {
		if(this.getPersonalBelongings() == null) {
			setPersonalBelongings(new Supply[0]);
		}
		Supply[] oldPersonalBelongings = this.getPersonalBelongings();
		int i;
		int count = 0;
	    for (i = 0; i < oldPersonalBelongings.length; i++) {
	        if (oldPersonalBelongings[i] == unwantedSupply) {
	            count++;
	        }
	    }
		Supply[] newPersonalBelongings = new Supply[oldPersonalBelongings.length - count];
	    int j;
	    for(j = 0; j < newPersonalBelongings.length; j++) {
	    	if(oldPersonalBelongings[j] != unwantedSupply) {
	    		newPersonalBelongings[j] = oldPersonalBelongings[j];
	    	}
	    }
		
	}
	
	public void removeFamilyConnection(FamilyRelation exRelation) {
		if(this.getFamilyConnections() == null) {
			setFamilyConnections(new FamilyRelation[0]);
		}
		FamilyRelation[] oldFamilyRelations = this.getFamilyConnections();
		int i;
		int count = 0;
	    for (i = 0; i < oldFamilyRelations.length; i++) {
	        if (oldFamilyRelations[i] == exRelation) {
	            count++;
	        }
	    }
		FamilyRelation[] newFamilyRelations = new FamilyRelation[oldFamilyRelations.length - count];
	    int j;
	    for(j = 0; j < newFamilyRelations.length; j++) {
	    	if(oldFamilyRelations[j] != exRelation) {
	    		newFamilyRelations[j] = oldFamilyRelations[j];
	    	}
	    }
	}
	
	public void addFamilyConnection(FamilyRelation relation) {
	    if (this.getFamilyConnections() == null) {
	        setFamilyConnections(new FamilyRelation[0]);    
	    }
	    FamilyRelation[] oldFamilyConnections = this.getFamilyConnections();
	    FamilyRelation[] newFamilyConnections = new FamilyRelation[oldFamilyConnections.length + 1];
	    int i;
	    for (i = 0; i < oldFamilyConnections.length; i++) {
	        newFamilyConnections[i] = oldFamilyConnections[i];
	    }
	    
	    newFamilyConnections[i] = relation;
	    setFamilyConnections(newFamilyConnections);
	}
	
	public void addMedicalRecord(MedicalRecord record) {
	    if (this.getMedicalRecords() == null) {
	        setMedicalRecords(new MedicalRecord[0]);
	    }
	    MedicalRecord[] oldMedicalRecords = this.getMedicalRecords();
	    MedicalRecord[] newMedicalRecords = new MedicalRecord[oldMedicalRecords.length + 1];
	    int i;
	    for (i = 0; i < oldMedicalRecords.length; i++) {
	        newMedicalRecords[i] = oldMedicalRecords[i];
	    }
	    
	    newMedicalRecords[i] = record;
	    setMedicalRecords(newMedicalRecords);
	}
	
	public String getEntryDate() {
		return ENTRY_DATE;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	private static int generateSocialId() {
		return counter++;
	}

	private static boolean isValidDateFormat(String date) {
		Pattern datePattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher match = datePattern.matcher(date);
		if(match.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private int convertDateStringToInt(String dateStr) {
		return Integer.parseInt(dateStr.replace("-", "")); 
	}
	
}
