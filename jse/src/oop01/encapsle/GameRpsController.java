package oop01.encapsle;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner scanner =new Scanner(System.in);
		GameRpsService service = new GameRpsService();
		
    System.out.println("���������� ������ �����մϴ�.");
    int playerValue =scanner.nextInt();
    service.logic(playerValue);
    int com =  service.Showcomvalue();
    System.out.println("�����"+ playerValue +"�� �����ϴ�.");
    System.out.println("��ǻ�ʹ�"+ com +"�� �����ϴ�.");
    System.out.println(service.game2(playerValue,com));
	}
	
//// 1 ���� 2 ���� 3 ��
}
