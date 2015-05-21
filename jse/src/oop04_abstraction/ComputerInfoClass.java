package oop04_abstraction;

public class ComputerInfoClass extends ProductInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo(){
		// �����ϼ���
		/*
		 ProductInfo Class �� �ִ�
		 �⺯�� Prviate �̹Ƿ� ������ �Ұ����մϴ�.
		 ���� ���Ŭ������ protected ����
		 ���� �����޴µ� ������ private ���� ��������.
		 �׷��� �⺯�� ���� ������ü�� �θ� �ִ�
		 displayinfo() �� ȣ���ؼ� ó���մϴ�.
		 */
		super.displayInfo();
		System.out.println("cpu ���� :"+this.cpu);
		System.out.println("���� �޸� ���� : " +this.ram);
		System.out.println("�ϵ� ��ũ ���� : " +this.hdd);
	}
	public void setInfo(String compay, String name,String sid, String cpu, String ram, String hdd){
		//�����ϼ���
		/*
		 �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super��
		 ���� �θ� �޼ҵ��� �Ķ���ͷ� ������
		 �ٷ� set �մϴ�.
		 ��.. �⺯�� ������ �θ��ڽ� ���迡��
		 �����ϹǷ�, �θ��� �⺯�� ���� ����
		 ���� ������ �����ϴ�.
		 */
		super.setIfo(compay, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
}
