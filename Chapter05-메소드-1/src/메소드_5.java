import java.util.Scanner;
/*
 * 	1. 난수 발생
 * 	2. 사용자 입력
 * 	3. 힌트
 * 	4. 종료 여부
 * 	--------------------- 조립 process()
 * 
 */

public class 메소드_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com = new int [3];
		// 1~9 => 중복 없이
		
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9) + 1;
			// 중복
			for(int j=0; j<i; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));
//		사용자 입력 => 정답을 맞춘다
		Scanner scan = new Scanner(System.in);
		int[] user = new int[3];
		while(true) {
			System.out.println("세자리 정수를 입력하세요 : ");
			int input = scan.nextInt();
			
			if(input < 100 || input > 999) {
				System.err.println("잘못된 입력입니다. 세자리 정수만 입력해주세요.");
				continue;
			}
			
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.err.println("같은 수는 사용할 수 없습니다!!");
				continue;
			}
			
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.err.println("0은 사용할 수 없습니다!!");
				continue;
			}
			
			// 비교
			int s = 0, b = 0;
			// s => 같은 자리의 같은 수
			// b => 같은 수만 존재
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i]==user[j]) { // 같은 수가 있는지
						if(i==j) { // 같은 자리
							s++;
						} else { // 다른 자리
							b++;
						}
					}
				}
			}
			System.out.printf("Input Number : %d. Result : %dS-%dB\n", input, s, b);
			
			if(s==3) {
				System.out.println("Game Over!!");
				break;
			}
			
		}

	}

}
