package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// Ŀ��
		int avg;
		String result = "";
		do {
			System.out.println("��� ������ �Է��ϼ���");
			avg = scanner.nextInt();	
		} while (avg>100 || avg<0);
	
		
		if (avg >= 70) {
			result = "�հ�";
		} else {
			result = "�����";
		}
		// ��������� ���� �� ���� ���ϱ�
		
		char grade = 'F';
	
		switch (avg/10) {
		case 10 : case 9:
            grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
			break;
		}
		System.out.println(result+grade);

	}

}
