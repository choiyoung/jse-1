package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	//�޼ҵ� �����ϼ���
	//�޼ҵ��� ��üȭ�� ���ּ���
	public int tot()
	{
		return this.kor+this.eng;
	}
	public double avg()
	{
		return (this.kor+this.eng)/2d;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		AverageB iron = new AverageB();
		
		
		hulk.name="��ũ";
		hulk.kor=90;
		hulk.eng=85;
		
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� :"+hulk.kor+"��");
		System.out.println("���� :"+hulk.eng+"��");
		System.out.println("���� :"+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		System.out.println();
		//���̾�
		iron.name="���̾�";
		iron.kor=70;
		iron.eng=85;
		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� :"+iron.kor+"��");
		System.out.println("���� :"+iron.eng+"��");
		System.out.println("���� :"+iron.tot()+"��");
		System.out.println("��� : "+iron.avg()+"��");
		System.out.println();
		//�丣
	
	}
}
