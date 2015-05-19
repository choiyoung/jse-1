package oop02.encapsle;

public class RpsService {
	RpsUtil rpsUtil = new RpsUtil();
	RpsVO vo = new RpsVO();

	public int displayComVal() {
		return (int) ((Math.random() * 3) + 1);
	}

	/*
	 * ���ڸ� �����ִ� ����
	 */public String showWinner(int player, int com) {
		// TODO Auto-generated method stub
		if (player == 1) {
			vo.setRock(player);
		} else if (player == 2) {
			vo.setPaper(player);
		} else if (player == 3) {
			vo.setScissors(player);
		}
		String result = "";
		
		/*
		switch (player = com) {
		case 0:
			result = "�����ϴ�.";
			break;
		case 1:case 2:
			result = "�÷��̾ �̰���ϴ�.";
			break;

		default:
			result = "�÷��̾ �����ϴ�.";
			break;
		}
		*/
		
		if (player < com) {
			if (Math.abs(player - com) == 2) {
				result = "��ǻ�Ͱ� �̰���ϴ�.";
			} else {
				result = "�÷��̾ �̰���ϴ�.";
			}
		} else if (player > com) {
			if (Math.abs(player - com) == 2) {
				result = "��ǻ�Ͱ� �̰���ϴ�.";
			} else {
				result = "�÷��̾ �̰���ϴ�.";
			}

		} else {
			result = "�����ϴ�.";
		}

		return result;
	}

	// ���ڿ� �Ҵ�� ���������� �� ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int val) {

		String result = "";
		switch (val) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;

		}
		return result;
	}
}
