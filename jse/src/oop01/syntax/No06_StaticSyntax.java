package oop01.syntax;

/*
 static ���� 
 -��������
 -Ŭ������ jvm ������ �ε��ÿ� �޸� �Ҵ��� �Ѵ�.
 -�ؽ� �ڵ� �� ���
 -��ü�� �ؽ��ڵ�� JVM�� �ؽþ˰��� ���� ��Ű�����
 Ŭ���� ���� ���յǿ� �ؽ��ڵ尡 ����ȴ�.
 -String �� ��ü������ ���� ���� ��� �� ���� ���ڿ���
 ������ ������ ..�ؽ��ڵ带 �����Ѵ�.
 String str1 = "��ũ";
 String str2 = "��ũ";
 str1.hashCode() = str2.hashCode()


 static ����� ����ؾ� �Ҷ� �� ��Ȳ
 -�⺯�� ��� �ν��Ͻ��� ���������� ����ؾ� �ϴ� ���� �ٿ����
 -�ν��Ͻ� ������ ������� �ʰ� , Ŭ�������� �ٷ� �����Ϸ� �� ��.


 */public class No06_StaticSyntax {
	public static void main(String[] args) {
   String hulk = new String("��ũ");
   String hulk2 = new String("��ũ");
   System.out.println(hulk.hashCode());
   System.out.println(hulk2.hashCode());
  System.out.println((hulk.hashCode() == hulk2.hashCode()));
   
  
   
	}
}
