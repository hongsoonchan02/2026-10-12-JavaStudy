// 2 + 4 + 6 + 8 ..... + 100
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for (int i = 2; i <= 100; i+=2) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
		// 5 10 15 20 25 30 35 40 45 50
		
//		for (int i = 5; i <= 50; i += 5) {
//			System.out.println(i);
//		}
		// B D F H J L N
		for (char c = 'B'; c <= 'N'; c += 2) {
			
			if (c > 'B' && c <= 'N') {
				System.out.print(", ");
			}
			System.out.print(c);
		}
	}

}
