package oop01.syntax;
/*
Date : 
Author :
Desc : static ����

*/public class CardNo {
  private String kind;//ī���� ����
  private int number;//ī���� ����
  static int width =100;//ī���� ��
  static int height =250;//ī���� ����


public CardNo(String kind, int number) {
	super();
	this.kind = kind;
	this.number = number;
}



public String getCard() {
	return this.kind + this.number;
}



}
