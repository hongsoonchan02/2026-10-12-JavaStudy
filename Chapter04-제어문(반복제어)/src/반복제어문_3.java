import java.util.Scanner;

public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random()*100) + 1;
		while(true) {
			
			System.out.println("정수 입력 : ");
			int user = scan.nextInt();
			
			if(user<1 || user> 100) {
				System.out.println("1~100 사이의 정수 입력해야 합니다");
				continue; // 처음부터 다시 시작
			}
			// 비교
			if(com>user) {
				System.out.println("입력값 UP");
			} else if(com<user) {
				System.out.println("입력값 DOWN");
			} else {
				System.out.println("Game Over!!");
				break;
				
			}
		}

	}

}
