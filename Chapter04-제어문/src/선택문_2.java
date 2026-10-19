// 문자열
/*
 * 		if			=> if(조건) 조건에 맞는 경우에만 수행(원하는 문장만 수행)
 * 							   => 상세보기 / 입력이 안된 경우
 * 							   => 아이디중복 / 우편번호
 * 		if~else		=> if(조건).. else..
 * 							   => 웹에서 사용 true(성공) / false(실패)
 * 							   => 로그인 성공 => main으로 이동
 * 								  로그인 실패 => 재로그인
 * 		if~else if  => 여러 조건을 순서대로 검사 = menu / 네트워크
 * 					   상황에 따라서 화면 변경
 * 		switch = 변수나 값에 따라 선택 => 여러개중에 1개만 실행
 * 		--------------------------------------- 1개 실행
 */

import java.util.Scanner;

public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.print("연산자 입력 : (+, -, *, /) : ");
		
		switch (scan.next()) {
		
		case "+" -> System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		case "-" -> System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		case "*" -> System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		case "/" -> {
			switch (num2) {
			
			case 0 -> System.out.println("0으로 나눌 수 없습니다.");
			default -> System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));
			}
		}
		default -> System.out.println("없는 연산자 입니다.");
		}

	}

}
