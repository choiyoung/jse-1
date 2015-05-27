package oop05.polymorphism;

public interface NumberMatchService {
	/*
	 컴퓨터가 랜덤으로 생성하는 숫자
	 0과 1만 발생시킴
	 */
	public int makeComeVal();
	/*
	 두개의 파라미터를 비교해서 일치하면 ture
	 다르면 false 리턴
	 */
	public boolean match(int playerVal,int comVal);
	/*
	 makeComVal() 의 리턴값이 ture 면 플레이어 승리
	 다르면 컴퓨터승리라고 메세지 출력
	 */
	public String display();
}
