import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; j++) {
				
				if(lotto[i] == lotto[j]) {
					
					i--;
					break;
					
				}
			}
		}
		// 정렬
		Arrays.sort(lotto);
		// 출력
		for(int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
