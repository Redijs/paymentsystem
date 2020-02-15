package lv.renata.emplouee;

import lv.renata.paysystem.Payee;

public class SalaryEmployee extends Employee {
	
	
	
	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name, bankAccount, grossWage); //sheit tas ir employee construktors
		
	}


	@Override
	public Double grossPayment() {
				return grossWage + doCurrentBonus();
	}


	
	public void giveBonus(Double percentage) {
	currentBonus += grossWage * (percentage/100.00);
	}
	
	

}
