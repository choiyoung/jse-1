package oop01.game;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ű�� �Է��Ͻÿ�");
		double height =scanner.nextDouble();
		System.out.println("�����Ը� �Է��Ͻÿ�");
		double weight =scanner.nextDouble();
		
		KaupVo vo = new KaupVo();
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.kaupmo();
		System.out.println(vo);
	}
	
}
