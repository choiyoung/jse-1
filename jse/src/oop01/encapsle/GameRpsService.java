package oop01.encapsle;

public class GameRpsService {
	GameRpsVo gameRpsVo = new GameRpsVo();

	public int Showcomvalue() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * 3) + 1);
	}

	public void logic(int action) {
		if (action == 1) {
			gameRpsVo.setRock(action);
		} else if (action == 2) {
			gameRpsVo.setPaper(action);
		} else {
			gameRpsVo.setScissors(action);
		}

	}

	String game3(int player, int com) {
    String result = "";
		switch (player) {
		case 1:result = "����";break;
		case 2:result = "����";break;
		case 3:result = "��"; break;
        
		}
		return null;
	}

	// ////////////////////////////////////////////////////
	String game2(int player, int com) {
		String result = "";

		// ���� ���� ��= ����
		if (player == 1) {
			if (com == 2) {
				result = "com ���� �̰���ϴ�.";
			} else if (com == 3) {
				result = "player ����  �̰���ϴ�.";
			} else if (com == 1) {
				result = "�����ϴ�.";
			}
		}
		// ���� �� = ��
		else if (player == 2) {
			if (com == 1) {
				result = "player ���� �̰���ϴ�.";
			} else if (com == 2) {
				result = "�����ϴ�.";
			} else if (com == 3) {
				result = "com �� �̰���ϴ�.";
			}
		}
		// ���� �� = ����
		else if (player == 3) {
			if (com == 1) {
				result = "com ���� �̰���ϴ�.";
			} else if (com == 2) {
				result = "player ������ �̰���ϴ�. ";
			} else if (com == 3) {
				result = "�����ϴ�.";
			}
		}
		return result;

	}
	
	String game(int player, int com) {
		String result = "";

		// ���� ���� ��= ����
		if (player <com) {
			if (com == 2) {
				result = "com ���� �̰���ϴ�.";
			} else if (com == 3) {
				result = "player ����  �̰���ϴ�.";
			} else if (com == 1) {
				result = "�����ϴ�.";
			}
		}
		// ���� �� = ��
		else if (player == 2) {
			if (com == 1) {
				result = "player ���� �̰���ϴ�.";
			} else if (com == 2) {
				result = "�����ϴ�.";
			} else if (com == 3) {
				result = "com �� �̰���ϴ�.";
			}
		}
		// ���� �� = ����
		else if (player == 3) {
			if (com == 1) {
				result = "com ���� �̰���ϴ�.";
			} else if (com == 2) {
				result = "player ������ �̰���ϴ�. ";
			} else if (com == 3) {
				result = "�����ϴ�.";
			}
		}
		return result;

	}

}
