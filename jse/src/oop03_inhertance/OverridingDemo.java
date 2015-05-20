package oop03_inhertance;

/*
 Method Overriding
 -��Ӱ��迡�� Parent �� ����� �޼ҵ带 Child���� �ٽ� ������ ���
 -�̷���� Parent �� �޼ҵ�� ���õ�
 -���� �޼ҵ尡 Parent �� Child ���� ��� ���� �Ǿ�����
 -������ �ٸ�
 -Ŭ������ �������� ������ �� ����
 -Parent �� child ���� �޼ҵ��� ����(�޼ҵ��,�Ķ���� ����,�Ķ���� ������)
 ���ƾ���
 -parent �� �޼ҵ带 ������ֳ� Child �� �ڽ��� ������ �޼ҵ带 �켱 ���
 -parent �� �޼ҵ� ����� �����ϸ鼭 ��Ȳ�� ���� Child �� ������
 -����� ����ϰ� ���� ��쿡 ����ϸ� ������ ������ �ٽɿ���
 -Parent  �� �޼ҵ� �� ĸ��ȭ�Ѵٰ� �� �� �ִ�.
 -Parent �� ������� ���ִ� ���� �ƴ϶� , 
 -�����ϸ鼭 ���ο� ������� ��ü�Ϸ��� �������� ���

 */public class OverridingDemo {
	/*
	parent �� show() �� child ��
	show() ������ �����Ƿ� ���ٶ��̵��̴�.  
	 
	*/ public static void main(String[] args) {
		ParentB b = new ChildB();
	   ChildB a =(ChildB) b;
		a.show();
		b.show();
		ChildB c = new ChildB();
		c.show();
	}

}

class ParentB {
	void show() {
		System.out.println("Parent show() ����");
	}

}
class ChildB extends ParentB {
	void show() {
		
		System.out.println("Child show()  ����");
	}	
}
