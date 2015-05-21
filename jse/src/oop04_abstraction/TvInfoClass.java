package oop04_abstraction;

public class TvInfoClass extends ProductInfoClass{
	private String screenSize;
	private String screenType;
	public void displayInfo(){
		super.displayInfo();
		System.out.println("화면 사이즈 :"+this.screenSize);
		System.out.println("화면 타임 :"+this.screenType);
	}
	public void setInfo(String company, String name, String sid, String screenSize, String screenType){
		//구현하세요
		super.setIfo(company, name, sid);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	
}
