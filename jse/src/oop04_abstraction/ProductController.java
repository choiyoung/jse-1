package oop04_abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "dual-core", "8G", "500GB");
		ci.displayProductInfor();
		System.out.println();
		
		TvINfo ti = new TvINfo();
		// �޼ҵ� ȣ��
		// TV ������
		// ȸ�� : LG
		// ��ǰ�� : Xĵ����
		// ��ǰID : x-1234
		// ȭ������� : 42dlscl
		// ȭ����� : 16:9
		ti.setTvInfo("LG", "Xĵ����", "x-1234", "42dlscl", "16:9");
		ti.displayProductInfor();
	}
}
