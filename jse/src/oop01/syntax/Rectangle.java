package oop01.syntax;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;

	public Rectangle() {
		origin = new Point(0, 0);
	}
	public Rectangle(Point p){
		origin = p;	
	}
	public Rectangle(int w,int h)
	{
		origin=new Point(0,0);
		width =w;
		height=h;
	}
	public Rectangle(Point p ,int x,int y)
	{
		origin=p;
		width=x;
		height=y;
	}
	//a method for movig the rectangle
	public void move(int x,int y){
		//ä�켼��
		//�Ķ���� ��ġ�� �ű�� ����� �ڵ�ȭ
		origin.x=x;
		origin.y=y;
	}
	//a method for computing the area of the rectangle
	public int getArea(){
		return width*height;
	}

}