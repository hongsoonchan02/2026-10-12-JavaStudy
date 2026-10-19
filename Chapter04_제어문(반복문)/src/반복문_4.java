/*
 * 	UP - DOWN
 * 	=> 힌트
 * 
 * 	1. 난수 (1~100)
 *     ----------- 입력해서 맞추는 프로그램
 *  2. 문제 발생
 *     => 몇번 수행
 *     => 무한루프 : for(;;)
 *     			   -------
 *     
 *  3. for만문 수행 (x)
 *     => if, switch case
 *     
 *	어디부터 시작 => int i = 1 i = 0 1 = 10
 *		| 초기값
 *	어디까지     => i <= 10 i < 1 i >= 1
 *		| 조건식
 *	반복횟수     => i++ i+=2 i--
 *		|
 *	반복 수행 문장
 *		=> for (초기값;조건식;증감식)
 *				반복 수행 문장
 *
 */

import java.util.Scanner;

public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1;
		
		for(;;) {
			// 사용자 입력 값
			System.out.print("숫자를 입력해주세요. : ");
			int user = scan.nextInt();
			// 오류발생
			if (user > 100 || user < 1) {
				System.out.println("잘못된 입력입니다.");
				continue; // 처음부터 다시 시작 => 증가식으로 이동
			}
			
			// 비교
			if (com > user) {
				System.out.println("UP");
			} else if (com < user) {
				System.out.println("DOWN");
			} else {
				System.err.println("정답입니다.");
				break; // 종료
			}
		}
		System.out.println("프로그램 종료!!");

	}

}
