package oop03_inhertance;

public class BankController {
public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();
	bankAccount.setAccount("123456", "1234", "ÇæÅ©", 100);
	bankAccount.printAccount();
	bankAccount.defrayment(100);
	bankAccount.printAccount();
	bankAccount.defrayment(300);
	bankAccount.printAccount();
	MinusAccount minusAccount = new MinusAccount();
	minusAccount.setAccount("123456", "1234", "¾ÆÀÌ¾ð", 100);
	minusAccount.printAccount();	
	minusAccount.defrayment(100);
	minusAccount.printAccount();
	minusAccount.defrayment(300);
	minusAccount.printAccount();
	minusAccount.defrayment(500);
	minusAccount.printAccount();
}
}
