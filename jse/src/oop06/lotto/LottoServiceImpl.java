package oop06.lotto;
public class LottoServiceImpl implements LottoService  {
	private int money;
	int[][] lottos;
	int[][] arr;
	@Override
	public void extractlottos(int money) {
		inputMoney(money);
		int count = this.getCount(money);
		int i = 0;
		boolean bool = false; 
		for(count = 0 ; count < lottos.length ; count++){
			lottos[count][0] = getRandomNum();
			while(true){
				// ���δ� �������ּ���
				// isDuplication() �޼ҵ� ����ؾ� �մϴ�.
				// �ߺ����� ���� �����̸�
				// lottos[count][i]=num ��
				// ���·� ���� �˴ϴ�.
				int result = getRandomNum();
				for(int j = 0; j < i ; j++){
					if(lottos[count][j]==result){
						bool = true;
						break;
					}
				}
				if(bool){
					continue;
				}
				lottos[count][i] = result;
				i++;
				if(i>5){
					i=0;
					break;
				}
			}			
		}
	}
	@Override
	public void printLotto() {
		int [] lottocip = new int[6];
		for(int i = 0;i<lottos.length;i++){
			for(int j = 0; j<lottocip.length;j++){
				lottocip[j] = lottos[i][j];	
			}			
		}	
		sort(lottocip);
	}
	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money/1000][6];
	}
	@Override
	public int getRandomNum() {
		return (int) ((Math.random()*45)+1);
	}
	@Override
	public boolean inDuplication() {
		return false;
	}
	@Override
	public void sort(int[] array) {
		for(int i = 0; i<array.length-1;i++){
			for(int j = 0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					// �ϼ����ּ���
					int cip = array[j];
					array[j] = array[j+1];
					array[j+1] = cip;				
			}		
		}			
	}	
		
		for(int i =0;i<lottos.length;i++){
			for(int j =0;j<array.length;j++){
			System.out.print(array[j]+"\t");
			}
		}System.out.println();
}
	/*
	 �ݾ��� �����ȵ� ��� extractLottos()
	 �� �������ΰ�?
	 �ܵ�
	 */
	public int getCount(int money){
		if(money<1000){
			return 0;
		}
		return (int) Math.ceil(money/1000);
	}
}