package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymous!!";

	public void Print(){
		new InnerClassAnonyservice() {
			
			@Override
			public void printData() {
				System.out.println("�͸� ����Ŭ���� ��� : "+data);
				
			}
		}.printData();
	}
	
}
