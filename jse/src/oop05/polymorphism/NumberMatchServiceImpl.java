package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	int comVal;
	int playerVal;
	boolean result;
	String msg;
	@Override
	public int makeComeVal() {
		this.comVal = (int)((Math.random()*5)+1);
		return 0;
	}

	@Override
	public boolean match(int playerVal, int comVal) {
	this. playerVal = playerVal ;
	this. comVal = comVal;
	if (playerVal == comVal) {	
		this.result = true;
	} else {		
		this.result = false;
	}
	return result;
	
		
	}

	@Override
	public String display() {
		if(playerVal < 1 || playerVal >5){
			System.out.println("1���� 5���� ������ �Է��ؾ� �մϴ�.");
		}else{
			if (playerVal == comVal) {
				
				msg = (playerVal + "���� !!");

			} else {
				
				msg = ("Ʋ�ǽ��ϴ�. ��ǻ�Ͱ� ������ ���� " + comVal + "�Դϴ�.");
			}	
		}					
		
		return msg;
		
		
	}
	
}
