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
				// 내부는 구현해주세요
				// isDuplication() 메소드 사용해야 합니다.
				// 중복되지 않은 숫자이면
				// lottos[count][i]=num 의
				// 형태로 들어가게 됩니다.
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
					// 완성해주세요
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
	 금액이 결정된뒤 몇번 extractLottos()
	 를 돌린것인가?
	 잔돈
	 */
	public int getCount(int money){
		if(money<1000){
			return 0;
		}
		return (int) Math.ceil(money/1000);
	}
}