package cmm03.flow;

import java.util.Scanner;

public class No2_IfElseDemo {

	int big;
	
	public void getBig(int a,int b,int c){
		if(a>b && a>c){
			System.out.println("���� ū ���� A ���� "+a+"�Դϴ�. ");
		}else if(b>a && b>c){
			System.out.println("���� ū ���� A ���� "+b+"�Դϴ�. ");
		}else{
			System.out.println("���� ū ���� A ���� "+c+"�Դϴ�. ");
		}
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No2_IfElseDemo instace = new No2_IfElseDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("A���� �Է��Ͻÿ� ");
		int a = scan.nextInt();
		System.out.println("B���� �Է��Ͻÿ� ");
		int b = scan.nextInt();
		System.out.println("c���� �Է��Ͻÿ� ");
		int c = scan.nextInt();
		instace.getBig(a, b, c);
		
		
	}

}
