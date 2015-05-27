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
				result = "컴퓨터가 이겻습니다.";
			} else {
				result = "플레이어가 이겻습니다.";
			}
		} else if (playerVal > comVal) {
			if (Math.abs(playerVal - comVal) == 2) {
				result = "플레이어가 이겻습니다.";
			} else {
				result = "컴퓨터가 이겻습니다.";
			}

		} else {
			result = "비겻습니다.";
		}
		

		
		return result;
	}

	@Override
	public String showRpsVal(int Val) {
		String result = "";
		switch (Val) {
		case 1:
			result = "가위";
			break;
		case 2:
			result = "바위";
			break;
		case 3:
			result = "보";
			break;

		}
		return result;
	}

}
