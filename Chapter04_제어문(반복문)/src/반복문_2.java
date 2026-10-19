// => 1~100까지의 총합
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for (int i = 1; i <= 100 ; i++) {
			System.out.println("sum = " + sum + ", i = " + i);
			sum += i;
		}   
		System.out.println("1~100까지의 합 : " + sum);
	}

}
