class InsuranceProvider{
	public static double insurance(String insuranceName){
		double termInsurance = 0.0;
		
		if(insuranceName == "LIC"){
			termInsurance = 8920.99;
		}
	else if (insuranceName == "Axis Bank Life Insurance"){
			termInsurance = 9520.00;
		}
	else if (insuranceName == "SBI Home Loan"){
			termInsurance = 5550.50;
		}
	else if (insuranceName == "ICICI Bank"){
			termInsurance = 9500.00;
		}
	else if (insuranceName == "Kotak Bank"){
			termInsurance = 5660.50;
		}
	else if (insuranceName == "Canara Life insurance"){
			termInsurance = 8520.50;
		}
	else if (insuranceName == "Bank of Baroda"){
			termInsurance = 7560.00;
		}
		else{
			System.out.println(insuranceName+" is not found");
		}
		return termInsurance;
	}

}