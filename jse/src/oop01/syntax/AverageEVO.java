package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	public AverageEVO() {}
	public AverageEVO(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	 public int tot()
		{
			return this.kor+this.eng;
		}
		public double avg()
		{
			return (this.kor+this.eng)/2d;
		}	
		
		
}
	//getter setter �� ������� ���ð� 
	//�����ڷ� ó��
	//�� avg tot�� �� �ۼ�
