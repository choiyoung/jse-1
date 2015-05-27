package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymous!!";

	public void Print(){
		new InnerClassAnonyservice() {
			
			@Override
			public void printData() {
				System.out.println("익명 내부클래스 출력 : "+data);
				
			}
		}.printData();
	}
	
}
