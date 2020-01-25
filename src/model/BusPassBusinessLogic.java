package model;

public class BusPassBusinessLogic {

	public boolean isEligible(BusPass pass, Passenger passenger) {
		//if pass requires Paratransit eligibility and the passenger does not have it, false (not eligible)
		if(pass.isParatransit && !passenger.eligibleParatransit) return false;
		//if pass requires ReducedFare eligibility and the passenger does not have it, false (not eligible)
		if(pass.isReducedFare && !passenger.eligibleReducedFare) return false;
		//no requirements, or all requirements met, true
		return true;
	}
	
	//calculates transaction based on price of pass and requested quantity
	public double calculateSale(BusPass pass, int quantity){
		return pass.getPrice()*quantity;
	}

}
