package cmm01.var;

/*
 * Upcasting
 * =��ȯ(Conversion)
 * =promotion
 * =������(implict) �ڵ���ȯ
 * :�ڹٰ� �����ϴ�  �ڵ���ȯ���� �������� ����
 * ������ Ÿ���� ǥ�������� �����ʿ��� ���������� ��ȯ �ɶ���
 * �����ϴ�
 */
public class No02_CastingDaomo {
	public static void main(String[] args) {
		byte varByte = 1;
		int varInt = 123;
		double varDou = 123.456d;

		int upByte = varByte;
		double upInt = varByte;

		/*
		 * Down-Casting = ĳ����(Casting) ���� ����ȯ :���α׷����� ��������� �����ϴ� Ÿ�� ��ȯ ��Һ�ȯ�� �Ǵ�
		 * ���� �ݵ�� ��������� ĳ�����Ͽ��� �Ѵ�. ���� !! ������ �ս��� �߻��Ҽ��ִ�.
		 */

		float varflo = 123.456f;
		int downflo = (int) varflo;
		System.out.println("�ٿ�ĳ���� �����  : " + downflo);

	}
}
