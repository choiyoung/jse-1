package oop04_abstraction;

public class ProductInfoClass implements ProductInterface{
	protected String company;
	protected String name;
	protected String sid;
	public void setIfo(String company,String name, String sid){
		this.company = company;
		this.name = name;
		this.sid = sid;
		
	}
	public void displayInfo(){
		System.out.println("ȸ�� : "+this.company);
		System.out.println("�̸� : "+this.name);
		System.out.println("ID : "+this.sid);
	}
}
