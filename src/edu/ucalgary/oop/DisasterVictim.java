package edu.ucalgary.oop;

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
	
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
		if (!isValidDateFormat(ENTRY_DATE) || !isValidDateFormat(dateOfBirth)) {
			throw new IllegalArgumentException("Not a valid date format. Please enter a date in the form yyyy-MM-dd")
		}
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		this.dateOfBirth = dateOfBirth;
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

	public void setDateOfBirth(String dateOfBirth) {
		if (!isValidDateFormat(dateOfBirth)) {
			throw new IllegalArgumentException("Not a valid date format. Please enter a date in the form yyyy-MM-dd");
		}
		this.dateOfBirth = dateOfBirth;
	} 
		
	public int getAssigned_Social_Id() {
		return ASSIGNED_SOCIAL_ID;
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
		
	}
	
	public void removePersonalBelonging(Supply unwantedSupply) {
		
	}
	
	public void removeFamilyConnection(FamilyRelation exRelation) {
		
	}
	
	public void addFamilyConnection(FamilyRelation relation) {
		
	}
	
	public void addMedicalRecord(MedicalRecord record) {
		
	}
	
	public String getENTRY_DATE() {
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
		return false;
	}
	
	private int convertDateStringToInt(String dateStr) {
		
	}
	
}
