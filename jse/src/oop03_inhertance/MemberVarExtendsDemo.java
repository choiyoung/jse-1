package oop03_inhertance;
class Car{
	String name= "�ڵ���";
}
class HCar extends Car{
	String brand= "����";
}

public class MemberVarExtendsDemo {
	public static void main(String[] args) {
		HCar h= new HCar();
		System.out.println(h.brand);
		System.out.println(h.name);
   	}
}
