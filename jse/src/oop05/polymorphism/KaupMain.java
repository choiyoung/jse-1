package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� :");
		double height =scanner.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ� :");
		double weight =scanner.nextDouble();
		KaupImterface service = new KaupServiceImpl();
		service.getKaupIndex(height, weight);
		System.out.println(service.getResultMsg()+" �Դϴ�.");
	}
}
