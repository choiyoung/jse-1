package oop01.syntax;

public class AverageD {

	public static void main(String[] args) {
		AverageService hulk = new AverageService();
		String name="��ũ";
		int kor=80;
		int eng=70;
        hulk.name(name, kor, eng);
		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� :"+kor+"��");
		System.out.println("���� :"+eng+"��");
		System.out.println("���� :"+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		System.out.println();
		
		
	}

}
