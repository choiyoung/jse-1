package comm04.array;

public class No01_IntArray {

	public static void main(String[] args) {
		int[] intarr;
		intarr = new int[10];

		intarr[0] = 100;
		intarr[1] = 200;
		intarr[2] = 300;
		intarr[3] = 400;
		intarr[4] = 500;
		intarr[5] = 600;
		intarr[6] = 700;
		intarr[7] = 800;
		intarr[8] = 900;
		intarr[9] = 1000;

		System.out.println("Element at index 9 : " + intarr[9]);

		for (int i : intarr) {
			System.out.println(i);
		}
	}

}
