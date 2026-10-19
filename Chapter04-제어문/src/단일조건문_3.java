/*
 * 		사칙연산 (+, -, *, /)
 * 		-------------------
 * 		사용자 입력
 * 		
 */

import java.util.Scanner;

public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("첫번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자 입력(+, -, *, /, %) : ");
		char op = scan.next().charAt(0);
		// => Scanner char를 받을 수 없다 => 문자열로 받는다 "+" => '+'
		// "abcdefg" 
		//  0123456
		
		if(op == '+') {
			// %c chat %s String %f double/float %d 정수
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		}
		if(op == '-') {
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		}
		if(op == '*') {
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		}
		if(op == '/') {
			// 중첩 조건문 => / (0에 대한 처리)
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			if (num2 != 0) {
				System.out.printf("%d / %d = %.2f\n", num1, num2, (double)num1 / num2);
			}
		}
		if(op == '%') {
			System.out.printf("%d %% %d = %d", num1, num2, num1 % num2);
		}

	}

}
