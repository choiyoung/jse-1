package oop09.nestedClass;
/*
 ����Ŭ���� (Inner class) ù���� ����.
 - �ν��Ͻ� ���� Ŭ����
 - �ɹ��޼ҵ带 Ŭ���� ���ο� ������.
 */
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public class Inner{
		public void printData(){
			System.out.println("�ɹ����� a : "+a);
			System.out.println("�����̺����� b : "+b);
			System.out.println("����ƽ���� c : "+c);
		}
	}
}