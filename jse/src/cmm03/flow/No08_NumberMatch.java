package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMatch {
	public static void main(String[] args) {
		No08_NumberMatchVo matchVo = new No08_NumberMatchVo();
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		/*
		 * do { System.out.println("���ڸ� �Է��Ͻÿ�");
		 * matchVo.setPlayer(scanner.nextInt()); matchVo.setCom(); result =
		 * matchVo.game(matchVo.getCom(), matchVo.getPlayer()); } while (result
		 * != 1);
		 */
		
		for (int i = 0; i < 3; i++) {
			System.out.println("1ȸ���� 5ȸ ���� ������ �Է��Ͻÿ�");
			
			try {
				int input = scanner.nextInt();
				matchVo.setPlayer(input);
				matchVo.setCom();
			} catch (Exception e) {
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}

			if (matchVo.getPlayer() == 0) {
				System.out.println("�ٽ� �Է��� �ֽʽÿ�");
			} else {
				matchVo.setCom();
				result = matchVo.game(matchVo.getCom(), matchVo.getPlayer());
			}

			if (result == 1) {
				System.out.println("�������ϴ�." + "������ �����մϴ�.");
				break;
			} else if (i == 2) {
				System.out.println("3ȸ���� �����߽��ϴ�."
						+ "\n ���ӿ� ���߽��ϴ�."
						+ "\n ���� �����մϴ�.");
				
			}
		}
		
	}
}
