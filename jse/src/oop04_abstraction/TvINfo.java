package oop04_abstraction;

public class TvINfo extends ProductInfo{
	
	protected String inchInfo;
	protected String screenRatioInfo;

	@Override
	public void displayProductInfor() {
		System.out.println("����ȸ�� :"+this.productCompany);
		System.out.println("��ǰ�� :"+this.productName);
		System.out.println("������ȣ :"+this.productSerialID);
		System.out.println("��ġ ���� :"+this.inchInfo);
		System.out.println("ȭ�� ���� :"+this.screenRatioInfo);
		
	}
	// �Ʒ� ������ �ϼ��Ͻÿ�.
	public void setTvInfo(String productCompany, String productName,String productserialID,
			String inchInfo, String screenRatioInfo){
		super.setProductInfo(productCompany, productName, productserialID);
		this.inchInfo =inchInfo;
		this.screenRatioInfo = screenRatioInfo;
		
		
	}
}
