package oop01.syntax;

class MilkCoffee {
	int money;
	public void setMoney(int money) {
		this.money = money;
	}

	public MilkCoffee() {
		System.out.println("���� �ִ�");
	}

	public MilkCoffee(int money) {
		this();
		System.out.println(money + "��");
		
		
	}
	public MilkCoffee(int money, boolean exist) {
		this(money);
		System.out.println("���Ű��ɿ��� : " + (exist == true ? "Ŀ����������" : "Ŀ������"));	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

public class CoffeeB {
/*
���� �ִ�
���Ű��ɿ��� :	Ŀ������ ����
�����µ� �����ڸ� �ѹ�����
*/	
	public static void main(String[] args) {
		MilkCoffee coffee = new MilkCoffee(500, true);
		System.out.println(coffee);
		MilkCoffee cc = new MilkCoffee();
		cc=coffee;
		System.out.println(cc);
	}
}
