package oop06.lotto;

public interface LottoService {
	/*
	 �ݾ׸�ŭ �ζǿ����� ����ϴ� �޼ҵ�
	 1000�������� ���.
	 ���� 1000�� ���� �ݾ��� �ִٸ�
	 �Ž������� ����
	 */
	public void extractlottos(int money);
	/*
	 �ζ� ��ȣ�� ����ϴ� �޼ҵ�
	 �ζǹ�ȣ�� 1~45�����̰�
	 ��µǴ� ����� �������� ������
	 �� ���ڵ��� 6�� �������� ����
	 1000�� ���� ����Ŭ ���� ���
	 ���� ���... 7000����ġ�� ��ٸ�
	 7���� 6�� ���ڰ� ������������
	 ���� ���̴�.
	 ��, ������ ���� ���ڴ� �ߺ����� �ʾƾ� �Ѵ�.
	 */
	public void printLotto();
	/*
	 ���� �Ա��� �� �ʵ忡 �����ϴ� ����
	 */
	public void inputMoney(int money);
	/*
	 ���� �� �����ϴ� ����
	 */
	public int getRandomNum();
	/*
	 �ζǴ� �ߺ��� ���ڰ� �־��
	 �ȵǹǷ� �ߺ����θ� �Ǵ��ϴ� ����
	 */
	public boolean inDuplication();
	/*
	 �ζǹ�ȣ�� ����Ҷ�
	 ������������ ��Ÿ������ �ϴ� ����
	 */
	public void sort(int[] array);
	public int getCount(int money);

}
