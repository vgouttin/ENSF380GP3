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
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		this.dateOfBirth = dateOfBirth;
	}
	
}
