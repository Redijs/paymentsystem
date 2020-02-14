package lv.renata.paysystem;
//maksaajuma sanjemeejs
// elementi konta numurs acc, vaards uzvards Name, summa gross


public interface Payee {
	String name();
	Double grossPayment();
	Integer bankAccount();

}
