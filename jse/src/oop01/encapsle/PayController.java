package oop01.encapsle;

import java.util.Scanner;

public class PayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    PayService service = new PayService();
    System.out.println("�̸��� �Է��Ͻÿ�");
    String name = scanner.nextLine();
    System.out.println("�޿��� �Է��Ͻÿ�");
    int salary = scanner.nextInt();
   
    
    
    System.out.println("------�޿�����------");
    System.out.println("����:"+name);
    System.out.println("����:" +salary +"��");
    System.out.println("����:" +  service.taxresult()+ "��");
    System.out.println("�Ǽ��ɾ�:" + service.logic(name, salary)+ "��");
	}

}
