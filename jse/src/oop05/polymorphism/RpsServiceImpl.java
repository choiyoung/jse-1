package oop05.polymorphism;

public class RpsServiceImpl implements RpsService {
	int comVal;
	int playerVal;
	
	@Override
	public int displayComVal() {
		this.comVal = (int) ((Math.random() * 3) + 1);
		return comVal;		
	}

	@Override
	public String showWinner(int playerVal, int comVal) {
		
		String result = "";
		if (playerVal < comVal) {
			if (Math.abs(playerVal - comVal) == 2) {
				result = "��ǻ�Ͱ� �̰���ϴ�.";
			} else {
				result = "�÷��̾ �̰���ϴ�.";
			}
		} else if (playerVal > comVal) {
			if (Math.abs(playerVal - comVal) == 2) {
				result = "�÷��̾ �̰���ϴ�.";
			} else {
				result = "��ǻ�Ͱ� �̰���ϴ�.";
			}

		} else {
			result = "�����ϴ�.";
		}
		

		
		return result;
	}

	@Override
	public String showRpsVal(int Val) {
		String result = "";
		switch (Val) {
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
