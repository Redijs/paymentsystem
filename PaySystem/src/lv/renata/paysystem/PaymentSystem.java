package lv.renata.paysystem;

import java.util.ArrayList;
import java.util.List;



public class PaymentSystem {
	public List<Payee> payees;
	
	public PaymentSystem(){ //konstruktors
		payees = new ArrayList<>();
	}
	
	public void addPayee(Payee payee){
		if(!payees.contains(payee)){
			payees.add(payee);			
	}
}		

public void processPayments(){
	for(Payee payee : payees){
		Double grossPayment = payee.grossPayment();
		
		System.out.println("Paying to "+ payee.name());
		System.out.println("Grosst "+ String.format("%1$, 2f", grossPayment)); //partaisa smuki, ar komatu un 2 cipariem aiz komata
		System.out.println("Transferred to account: " + payee.bankAccount());
		}
	}
}
	
