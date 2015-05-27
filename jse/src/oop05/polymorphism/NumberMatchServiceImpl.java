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
			System.out.println("1부터 5까지 정수만 입력해야 합니다.");
		}else{
			if (playerVal == comVal) {
				
				msg = (playerVal + "정답 !!");

			} else {
				
				msg = ("틀렷습니다. 컴퓨터가 선택한 값은 " + comVal + "입니다.");
			}	
		}					
		
		return msg;
		
		
	}
	
}
