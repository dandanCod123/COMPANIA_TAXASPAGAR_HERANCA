package entities;

public class Individual extends TaxPayer {

	private double heathExpend;
	
	public Individual() {		
	}

	public Individual(String name, Double anualIncome, double heathExpend) {
		this.heathExpend = heathExpend;
	}

	public double getHeathExpend() {
		return heathExpend;
	}

	public void setHeathExpend(double heathExpend) {
		this.heathExpend = heathExpend;
	}
	
	@Override
	public double tax() {
		double basicTax = 0;
		if(getAnualIncome() < 20000) {
			 basicTax = getAnualIncome() * 0.15; 
		} else if(getAnualIncome() >= 20000) {
			basicTax = getAnualIncome() * 0.25;
		}
		basicTax -= (getHeathExpend() * 0.50);
		
		
		return basicTax;
	}
	
}
