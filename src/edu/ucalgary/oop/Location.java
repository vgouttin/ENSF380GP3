package edu.ucalgary.oop;

public class Location {
	private String name;
	private String address;
	private DisasterVictim[] occupants;
	private Supply[] supplies;
	
	public Location(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DisasterVictim[] getOccupants() {
		return occupants;
	}

	public void setOccupants(DisasterVictim[] occupants) {
		this.occupants = occupants;
	}

	public Supply[] getSupplies() {
		return supplies;
	}

	public void setSupplies(Supply[] supplies) {
		this.supplies = supplies;
	}
	
	public void addOccupant(DisasterVictim occupant) {
		
	}
	
	public void removeOccupant(DisasterVictim occupant) {
		
	}
	
	public void addSupply(Supply supply) {
		
	}
	
	public void removeSupply(Supply supply) {
		
	}
}
