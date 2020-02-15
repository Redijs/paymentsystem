package lv.renata.emplouee;

import lv.renata.paysystem.Payee;

public class ComissionEmployee extends Employee { // pirms tam bija implements Payee

	private Double grossComission = 0.0;

	private static final Double BONUS_MULTIPLIER = 1.5;

	public ComissionEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name, bankAccount, grossWage);

	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentComission() + doCurrentBonus();
	}

	private Double doCurrentComission() {
		Double commission = grossComission;
		grossComission = 0.0;
		return commission;

	}

	public void giveCommision(Double amount) {// metode, kas pieshkirs komisiju
		grossComission += amount; // viens variants
		// grossComission = grossComission + amount; //tas pats, tikai cits pieraksts

	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage / 100) * BONUS_MULTIPLIER;

	}

}
