package oop01.syntax;

public class AverageC {

	public static void main(String[] args) {
		AverageVo hulk = new AverageVo();
		AverageVo iron = new AverageVo();
		hulk.setName("��ũ");
		hulk.setEng(80);
		hulk.setKor(70);
		System.out.println("==="+hulk.getName()+"�� ����ǥ===");
		System.out.println("���� :"+hulk.getKor()+"��");
		System.out.println("���� :"+hulk.getEng()+"��");
		System.out.println("���� :"+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		System.out.println();
		
		
		iron.setName("���̾�");
		iron.setEng(85);
		iron.setKor(70);
		System.out.println("==="+iron.getName()+"�� ����ǥ===");
		System.out.println("���� :"+iron.getKor()+"��");
		System.out.println("���� :"+iron.getEng()+"��");
		System.out.println("���� :"+iron.tot()+"��");
		System.out.println("��� : "+iron.avg()+"��");
		System.out.println();
	
	}

}
