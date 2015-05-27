package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("키를 입력하시오 :");
		double height =scanner.nextDouble();
		System.out.print("몸무게를 입력하시오 :");
		double weight =scanner.nextDouble();
		KaupImterface service = new KaupServiceImpl();
		service.getKaupIndex(height, weight);
		System.out.println(service.getResultMsg()+" 입니다.");
	}
}
