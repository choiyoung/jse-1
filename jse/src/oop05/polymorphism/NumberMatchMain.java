package oop05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {

	public static void main(String[] args) {
		int playerVal = 0;
		int comVal = 0;
		Scanner scanner = new Scanner(System.in);
		NumberMatchService service = new NumberMatchServiceImpl();
		System.out.println("���� �Է����ּ���");
		playerVal=scanner.nextInt();
		
		service.match(playerVal, comVal);
		service.display();
	}

}
