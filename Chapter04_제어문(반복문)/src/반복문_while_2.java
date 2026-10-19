// 1~100까지 사이의 3배수 / 5배수 / 7의 배수 출력
public class 반복문_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
//		while (i <= 100) {
//			
//			if (i % 3 == 0) {
//				
//				System.out.print(i + " ");
//			} else if (i % 5 == 0) {
//				
//				System.out.print(i + " ");
//			} else if (i % 7 == 0) {
//				
//				System.out.print(i + " ");
//			}
//			
//			i++;
//		}
		System.out.println("===== 3의 배수 =====");
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		i = 1;
		System.out.println("\n===== 5의 배수 =====");
		while (i <= 100) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		i = 1;
		System.out.println("\n===== 7의 배수 =====");
		while (i <= 100) {
			if (i % 7 == 0) {	
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
