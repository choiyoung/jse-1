package oop02.encapsle;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class RpsController {
	public static void main(String[] args) {
		RpsService rpsService  = new RpsService();
		RpsUtil rpsUtil = new RpsUtil();
		
		
		System.out.println("���� ���� �� ������ �����մϴ�.");
		System.out.println("1.���� 2.����  3.���ڱ� �� �Է��Ͻÿ�");
		Scanner scanner  = new Scanner(System.in);
		int player = scanner.nextInt();
		rpsService.showRpsVal(player);
		
	
		if (player < 1 || player >3 ) {
			System.out.println(rpsUtil.showRange(1,3));
		}else {
		System.out.println("�÷��̾�� "+rpsService.showRpsVal(player)+"�� �����ϴ�.");
		int comVal = rpsService.displayComVal();
		rpsService.showRpsVal(comVal);
		System.out.println("��ǻ�ʹ�"+rpsService.showRpsVal(comVal) +"�� �����ϴ�.");
		String winner = rpsService.showWinner(player,comVal);
		System.out.println(winner);
		}
	}
}
