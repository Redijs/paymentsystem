package lv.renata.test;

import java.util.Arrays;

import lv.renata.emplouee.ComissionEmployee;
import lv.renata.emplouee.SalaryEmployee;
import lv.renata.paysystem.PaymentSystem;

public class TestPayment {

	public static void main(String[] args) {
		PaymentSystem paymentSystem = new PaymentSystem();
		
		ComissionEmployee toms = new ComissionEmployee("Toms Ozolins", 1010101, 5000.5);
		paymentSystem.addPayee(toms);
				
		ComissionEmployee ieva = new ComissionEmployee("Ieva Berzina", 2020202, 5600.5);
		paymentSystem.addPayee(ieva);
		
		
		SalaryEmployee valters = new SalaryEmployee ("Valters Berzs",  3030303, 2000.4);
		paymentSystem.addPayee(valters);
		
		SalaryEmployee arita = new SalaryEmployee ("Arita Klava",  4040404, 5432.4);
		paymentSystem.addPayee(arita);
		
		valters.giveBonus(10.0);
		ieva.giveBonus(7.0);
		
		//simulate work
		toms.giveCommision(4.0);
		toms.giveCommision(50.3);
		
		ieva.giveCommision(30.2);
		toms.giveCommision(4.0);
		toms.giveCommision(52.3);
		ieva.giveCommision(40.2);
		
		
		paymentSystem.processPayments();
		
		
		Double d = 40.33333312;
		System.out.println(String.format("%1$, .2f", d));//partaisa smuki, ar komatu un 2 cipariem aiz komata. Shiis lai vnk patesteetu, jaaliek ieksh PaymentSystem faila
		//var likt arii bez komata un $ ziimes
	}

}
