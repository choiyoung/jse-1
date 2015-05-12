package cmm03.flow;

import java.util.Scanner;

public class No07_kaup {

	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	No07_kaup() {
		this(0,0);
	}
	No07_kaup(double i,double j) {
		// TODO Auto-generated constructor stub
		this.height = i;
		this.weight = j;
		this.idx = (int) ((weight/(height*height))*10000);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
     String getMsg(){
		String msg ="";
		if(idx>30){msg = "��";}
		else if(idx>24){msg = "��ü��";}
		else if(idx>20){msg = "����";}
		else if(idx>15){msg = "��ü��";}
		else if(idx>13){msg = "����";}
		else if(idx>10){msg = "�������";}
		else{msg = "�Ҹ���";}
		return msg;
	}
	@Override
	public String toString() {
		return "ī�������� No07_kaup [Ű=" + height +"cm "+ ", ������=" + weight +"kg"+", ī��������="
				+ getMsg() + "]";
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ű�� �Է��Ͻÿ�");
		double height =scanner.nextDouble();
		System.out.println("�����Ը� �Է��Ͻÿ�");
		double weight =scanner.nextDouble();
		/*
		�ڵ�ϼ�
		2�ٳ���
		*/
		No07_kaup ss = new No07_kaup(height, weight);
		System.out.println(ss);
	}
}
