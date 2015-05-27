package oop06.lotto;
import java.util.Scanner;
public class LottoMain {
	public static void main(String[] args) {
		System.out.println("◀◀◀로또시작▶▶▶");
		LottoService lotto = new LottoServiceImpl();
		System.out.println("얼마를 구입합시닙까?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();	
		lotto.extractlottos(money);
		System.out.println("로또번호 출력");
		lotto.printLotto();
	}
}