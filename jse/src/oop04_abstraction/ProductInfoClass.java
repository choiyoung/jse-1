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
		System.out.println("회사 : "+this.company);
		System.out.println("이름 : "+this.name);
		System.out.println("ID : "+this.sid);
	}
}
