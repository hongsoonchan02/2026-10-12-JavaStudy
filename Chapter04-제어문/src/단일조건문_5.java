/*
 * 		사용자 => 년도 입력 : yeae
 * 			   ----------
 * 				| 윤년인지 확인
 * 				  = 4년마다
 * 					year % 4 == 0
 * 				  = 100년마다 제외
 * 					year % 100 != 0
 * 				  = 400년마다
 * 					year % 400 == 0
 * 				  ----------------------
 * 				year % 4 == 0 && year % 100 != 0 || year % 400 == 0 => 윤년 처리 공색
 */

import java.util.Scanner;

public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
	}

}
