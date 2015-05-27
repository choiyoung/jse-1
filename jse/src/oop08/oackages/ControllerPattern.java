package oop08.oackages;

import java.util.Scanner;

import oop02.encapsle.NumberMatchController;
import oop02.encapsle.RpsController;

public class ControllerPattern {
	public static void main(String[] args) {
		ControllerPattern cp = new ControllerPattern();
		RpsController rps = new RpsController();
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		do{
			System.out.println("진행 프로그세서 번호를 입력하세요.");
			System.out.println("입력을 마치려면 0을 입력하세요");
			flag = scanner.nextInt();
			switch(flag){
			case 1 : rps.main(args);
			}
		}while(flag != 0);
	}

}
