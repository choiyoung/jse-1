package oop06.lotto;

public interface LottoService {
	/*
	 금액만큼 로또요지를 출력하는 메소드
	 1000원단위로 출력.
	 만약 1000원 이하 금액이 있다면
	 거스름돈은 절삭
	 */
	public void extractlottos(int money);
	/*
	 로또 번호를 출력하는 메소드
	 로또번호는 1~45까지이고
	 출력되는 결과는 오름차순 정렬이
	 각 숫자들은 6개 묶음으로 한줄
	 1000원 단위 돈만클 행이 출력
	 예를 들어... 7000원어치를 샀다면
	 7줄의 6개 숫자가 내림차순으로
	 찍힐 것이다.
	 단, 주의할 점은 숫자는 중복되지 않아야 한다.
	 */
	public void printLotto();
	/*
	 돈을 입금한 후 필드에 저장하는 로직
	 */
	public void inputMoney(int money);
	/*
	 램덤 언어를 생성하는 로직
	 */
	public int getRandomNum();
	/*
	 로또는 중복된 숫자가 있어서는
	 안되므로 중복여부를 판단하는 로직
	 */
	public boolean inDuplication();
	/*
	 로또번호를 출력할때
	 오름차순으로 나타나도록 하는 로직
	 */
	public void sort(int[] array);
	public int getCount(int money);

}
