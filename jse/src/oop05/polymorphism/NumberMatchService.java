package oop05.polymorphism;

public interface NumberMatchService {
	/*
	 ��ǻ�Ͱ� �������� �����ϴ� ����
	 0�� 1�� �߻���Ŵ
	 */
	public int makeComeVal();
	/*
	 �ΰ��� �Ķ���͸� ���ؼ� ��ġ�ϸ� ture
	 �ٸ��� false ����
	 */
	public boolean match(int playerVal,int comVal);
	/*
	 makeComVal() �� ���ϰ��� ture �� �÷��̾� �¸�
	 �ٸ��� ��ǻ�ͽ¸���� �޼��� ���
	 */
	public String display();
}
