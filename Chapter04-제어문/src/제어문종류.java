/*
 * 	제어문
 * 		1) 사용 목적
 * 		   조건에 따라서 코드를 다르게 실행이 가능하게 만든다
 * 		   => 같은 작업을 반복, 반복 실행을 줃단
 * 		   => 해당 조건 처리
 * 		   1) 조건에 따라 실행
 * 				=> if / switch
 * 				   회원 / 비회원
 * 		   2) 같은 작업 반복
 * 			  for      => 반복횟수 지정 => 화면 출력
 * 			  while    => 반복 횟수가 없는 경우 => DataBase
 * 			  do~while => 반드시 한번이상을 수행
 * 		   3) 반복수행 중단 / 정지
 * 			  break / continue
 * 			   종료	 특정부분을 제외
 * 
 * 
 * 		--------------------------------------------
 * 		***if
 * 		***if~else
 * 		if~else if else if
 *		switch
 *		------------------------------------------ 조건에 따라 선택하는 문장
 *		***for
 *		***while
 *		do~while
 *		------------------------------------------ 반복수행이 많은 경우
 *		***break
 *		continue
 *		------------------------------------------ 반복을 변경
 *
 *		조건문
 *		 = 단일 조건문
 *		   형식)
 *				if(조건문) {
 *				  ------ 반드시 true / false => 부정연산자 / 비교연산자 / 논리연산자만 사용이 가능
 *					조건이 true일 경우에 수행 문장
 *					** false면 수행하지 않고 건너뛴다
 *				}
 *				=> 독립적이다 => 속도가 늦다
 *		 = 선택 조건문
 *		 = 다중 조건문
 */
import java.util.Scanner;
// 사용자 => 정수 입력 => 짝수 / 홀수
// 					num % 2 == 0
public class 제어문종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		// 입력된 값 받기
		int num = scan.nextInt();
		/*
		 * 	1) 정수 : nextInt()
		 * 	2) 실수 : nextDouble()
		 *  3) 논리 : nextBoolean()
		 *  4) 문자열 : next() / nextLine()
		 *  *** 문자(x)
		 */
		// 모든 제어문은 {}이 없는 경우 바로 밑에 있는 1개의 문장만 제어
		// 문장이 여러개면 {} => 기본
		
		if(num % 2 == 0) {
			System.out.println("num값은 " + num);
			System.out.println(num + "은(는) 짝수입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.println("num값은 " + num); 
			System.out.println(num + "은(는) 홀수입니다.");
		}
		
	}

}
