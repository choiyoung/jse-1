package oop01.syntax;

public class AverageA {
	String name;
	int kor,eng;
	public static void main(String[] args) {
    //tot avg ���������� �����Ͻð�
		//�Ʒ��� ���� ��µǵ��� ���ּ���
		int tot=0;
		double avg=0;
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		hulk.name="��ũ";
		hulk.kor=90;
		hulk.eng=80;
		tot = hulk.kor+hulk.eng;
		avg = tot/2d;
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� :"+hulk.kor+"��");
		System.out.println("���� :"+hulk.eng+"��");
		System.out.println("���� :"+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
		//���̾�
		iron.name="���̾�";
		iron.kor=70;
		iron.eng=80;
		tot = iron.kor+iron.eng;
		avg = tot/2d;
		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� :"+iron.kor+"��");
		System.out.println("���� :"+iron.eng+"��");
		System.out.println("���� :"+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
		//�丣
		thor.name="�丣";
		thor.kor=60;
		thor.eng=85;
		tot = thor.kor+thor.eng;
		avg = tot/2d;
		System.out.println("==="+thor.name+"�� ����ǥ===");
		System.out.println("���� :"+thor.kor+"��");
		System.out.println("���� :"+thor.eng+"��");
		System.out.println("���� :"+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
	}
}
