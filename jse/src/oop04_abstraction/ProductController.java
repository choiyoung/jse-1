package oop04_abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("삼성", "센스", "a-1234-4567", "dual-core", "8G", "500GB");
		ci.displayProductInfor();
		System.out.println();
		
		TvINfo ti = new TvINfo();
		// 메소드 호출
		// TV 정보는
		// 회사 : LG
		// 제품명 : X캔버스
		// 제품ID : x-1234
		// 화면사이즈 : 42dlscl
		// 화면비율 : 16:9
		ti.setTvInfo("LG", "X캔버스", "x-1234", "42dlscl", "16:9");
		ti.displayProductInfor();
	}
}
