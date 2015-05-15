package oop01.encapsle;

public class KaupVo {
	private double height;
	double weight;
	int idx;
	String msg;

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getMsg() {
		return msg;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	void kaupmo()
	{
	
		setIdx( (int) ((this.weight/(this.height*this.height))*10000));
		setMsg();
	}
	 public void setMsg(){
			
			if(idx>30){msg = "��";}
			else if(idx>24){msg = "��ü��";}
			else if(idx>20){msg = "����";}
			else if(idx>15){msg = "��ü��";}
			else if(idx>13){msg = "����";}
			else if(idx>10){msg = "�������";}
			else{msg = "�Ҹ���";}
		
		
		}
	 public String toString() {
			return "ī�������� No07_kaup [Ű=" + height +"cm "+ ", ������=" + weight +"kg"+", ī��������="
					+ getMsg() + "]";
		}
}
