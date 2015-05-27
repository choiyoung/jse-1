package oop05.polymorphism;

import java.util.Scanner;

import oop02.encapsle.RpsService;
import oop02.encapsle.RpsUtil;

public class RpsMain {

	public static void main(String[] args) {
		RpsServiceImpl rpsService = new RpsServiceImpl();		
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("1.가위 2.바위  3.보자기 를 입력하시오");
		Scanner scanner  = new Scanner(System.in);
		int player = scanner.nextInt();
		rpsService.showRpsVal(player);
		
	
	
		System.out.println("플레이어는 "+rpsService.showRpsVal(player)+"를 냇습니다.");
		int comVal = rpsService.displayComVal();
		rpsService.showRpsVal(comVal);
		System.out.println("컴퓨터는"+rpsService.showRpsVal(comVal) +"를 냇습니다.");
		String winner = rpsService.showWinner(player,comVal);
		System.out.println(winner);
		

	}

}
