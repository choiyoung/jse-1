package oop04_abstraction;

public class TvInfoClass extends ProductInfoClass{
	private String screenSize;
	private String screenType;
	public void displayInfo(){
		super.displayInfo();
		System.out.println("ȭ�� ������ :"+this.screenSize);
		System.out.println("ȭ�� Ÿ�� :"+this.screenType);
	}
	public void setInfo(String company, String name, String sid, String screenSize, String screenType){
		//�����ϼ���
		super.setIfo(company, name, sid);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	
}
