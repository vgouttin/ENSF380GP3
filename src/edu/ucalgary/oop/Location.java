package edu.ucalgary.oop;

import java.util.List;

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
		   if (this.getOccupants() == null) {
	            setOccupants(new DisasterVictim[0]);
	        }
	        DisasterVictim[] oldOccupants = this.getOccupants();
	        DisasterVictim[] newOccupants = new DisasterVictim[oldOccupants.length + 1];
	        int i;
	        for (i = 0; i < oldOccupants.length; i++) {
	            newOccupants[i] = oldOccupants[i];
	        }
	        
	        newOccupants[i] = occupant;
	        setOccupants(newOccupants);
	}
	
	public void removeOccupant(DisasterVictim occupant) {
		if (this.getOccupants() == null) {
            setOccupants(new DisasterVictim[0]);
        }
        DisasterVictim[] oldOccupants = this.getOccupants();
        int count = 0;
        for (DisasterVictim dv : oldOccupants) {
            if (dv == occupant) {
                count++;
            }
        }
        DisasterVictim[] newOccupants = new DisasterVictim[oldOccupants.length - count];
        int j = 0;
        for (DisasterVictim dv : oldOccupants) {
            if (dv != occupant) {
                newOccupants[j++] = dv;
            }
        }
        setOccupants(newOccupants);
	}
	
	public void addSupply(Supply supply) {
		 if (this.getSupplies() == null) {
	            setSupplies(new Supply[0]);
	        }
	        Supply[] oldSupplies = this.getSupplies();
	        Supply[] newSupplies = new Supply[oldSupplies.length + 1];
	        int i;
	        for (i = 0; i < oldSupplies.length; i++) {
	            newSupplies[i] = oldSupplies[i];
	        }
	        
	        newSupplies[i] = supply;
	        setSupplies(newSupplies);
	}
	
	public void removeSupply(Supply supply) {
		 if (this.getSupplies() == null) {
	            setSupplies(new Supply[0]);
	        }
	        Supply[] oldSupplies = this.getSupplies();
	        int count = 0;
	        for (Supply s : oldSupplies) {
	            if (s == supply) {
	                count++;
	            }
	        }
	        Supply[] newSupplies = new Supply[oldSupplies.length - count];
	        int j = 0;
	        for (Supply s : oldSupplies) {
	            if (s != supply) {
	                newSupplies[j++] = s;
	            }
	        }
	        setSupplies(newSupplies);
	}
}
