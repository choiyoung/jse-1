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
		System.out.println(this.accountNum+"�� �ֽ��ϴ�.");
		
	}
		public void defrayment(int pay){
		if(this.balance+miunsLimit>= pay){
			this.balance = this.balance - pay;
			System.out.println(pay+"������ ����߽��ϴ�.");
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
	
}	public void printAccount(){
	System.out.println("(���̳ʽ�����)���� ��ȣ : " +this.accountNum);
	System.out.println("�� �� �� : "+this.ownerName);
	System.out.println();
}
		}
