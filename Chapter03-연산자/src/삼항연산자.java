/*
 * 		삼항연산자 : 소스를 간결하게 만드는 경우 => 화면 출력 
 * 		-------
 * 		  형식)
 * 			  조건 ? 값1 : 값 2
 * 			  ---
 * 			  true => 값1
 * 			  false => 값2
 * 			  조건 => 부정연산자 / 논리연산자 / 비교연산자
 * 					 -------------------------- 결과값이 true / false
 */

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");

	}

}
