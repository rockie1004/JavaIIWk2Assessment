//passenger account for purchase of bus pass, tracks eligibility for certain programs and pass types.
package model;

public class Passenger {
	String username;
	boolean eligibleReducedFare;
	boolean eligibleParatransit;
	
	public Passenger(String username, boolean eligibleReducedFare, boolean eligibleParatransit) {
		this.username = username;
		this.eligibleReducedFare = eligibleReducedFare;
		this.eligibleParatransit = eligibleParatransit;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isEligibleReducedFare() {
		return eligibleReducedFare;
	}

	public void setEligibleReducedFare(boolean eligibleReducedFare) {
		this.eligibleReducedFare = eligibleReducedFare;
	}

	public boolean isEligibleParatransit() {
		return eligibleParatransit;
	}

	public void setEligibleParatransit(boolean eligibleParatransit) {
		this.eligibleParatransit = eligibleParatransit;
	}
	
	

}
