package oop03_inhertance;

public class MinusAccount extends BankAccount{
	private int miunsLimit;
	
	public void setAccount(String accountNum,
							String accountPass,
							String ownerName,
							int pay,
							int minusLimit){
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.ownerName = ownerName;
		this.balance = pay;
		this.miunsLimit = minusLimit;
		System.out.println(this.accountNum+"가 있습니다.");
		
	}
		public void defrayment(int pay){
		if(this.balance+miunsLimit>= pay){
			this.balance = this.balance - pay;
			System.out.println(pay+"만원을 출금했습니다.");
		}else{
			System.out.println("잔액이 부족합니다.");
		}
	
}	public void printAccount(){
	System.out.println("(마이너스통장)계좌 번호 : " +this.accountNum);
	System.out.println("예 금 주 : "+this.ownerName);
	System.out.println();
}
		}
