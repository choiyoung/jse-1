package oop05.polymorphism;

public class KaupServiceImpl implements KaupImterface{
	KaupVO vo = new KaupVO();
	
	int idx ;
	public int getKaupIndex(double height,double weight) {
		vo.setHeight(height);
		vo.setWeight(weight);
		int result = 0;
		result = (int) ((weight/(height*height))*10000);
		return result;
	}

	@Override
	public String getResultMsg() {		
		String msg = null;
		this.idx = this.getKaupIndex(vo.getHeight(), vo.getWeight());
		if(idx>30){msg = "비만";}
		else if(idx>24){msg = "과체중";}
		else if(idx>20){msg = "정상";}
		else if(idx>15){msg = "저체중";}
		else if(idx>13){msg = "마름";}
		else if(idx>10){msg = "영양실조";}
		else{msg = "소모증";}
		return msg;
	}

	
}
