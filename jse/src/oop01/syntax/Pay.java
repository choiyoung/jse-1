package oop01.syntax;

public class Pay {
	
	static final double TAX=0.1;
	 String name;
	 int salary;

	public static void main(String[] args) {
		Pay pay= new Pay();
		
		
		pay.name = "��ũ";
		pay.salary = 334;
		System.out.println("==="+pay.name +"�� 5���� �Ǳ޿���" +(int)(pay.salary-(pay.salary*TAX))+ "�����Դϴ�.");
	
		pay.name = "���̾�";
		pay.salary = 556;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿���"+(int)(pay.salary-(pay.salary*TAX))+"�����Դϴ�.");
		
		pay.name = "�丣";
		pay.salary = 112;
		System.out.println("==="+ pay.name+"�� 5���� �Ǳ޿���"+(int)(pay.salary-(pay.salary*TAX))+"�����Դϴ�.");
		
	
	
	
	
	
	
	}
}
