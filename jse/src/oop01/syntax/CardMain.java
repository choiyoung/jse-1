package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println("ī�� ���� : "+CardNo.height);
        System.out.println("ī�� �ʺ� : "+CardNo.width);
      
      //�������� �����ϼż� �Ʒ� ���ó��
     //���
      
      CardNo player = new CardNo("��Ʈ",3);
      CardNo com = new CardNo("�����̽�",5);
    
      
      System.out.println("�÷��̾��"+player.getCard()+"�̰� ");//heart space
      System.out.println("��ǻ�Ͱ�" +com.getCard() +"�� ��ǻ�Ͱ� �̰���ϴ�.");
	}

}
