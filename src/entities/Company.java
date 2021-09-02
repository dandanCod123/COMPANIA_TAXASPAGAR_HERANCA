package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
	@Override
	public double tax() {
		double taxComp = 0;
		taxComp -= getAnualIncome() * 0.16;
		if(numberOfEmployees > 10) {
			taxComp += getAnualIncome() * 0.14;		}
		
		return taxComp;
	}

	
	
	
}
