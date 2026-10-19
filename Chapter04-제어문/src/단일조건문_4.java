/*
 * 		알파벳 받아서 => 대문자 / 소문자 / 숫자 / 기타
 */

import java.util.Scanner;

public class 단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char c = scan.next().charAt(0);
		if(c >= 'A' && c <= 'Z') {
			System.out.println(c + "는(은) 대문자입니다");
		}
		if(c >= 'a' && c <= 'z') {
			System.out.println(c + "는(은) 소문자입니다");
		}
		if(c >= '0' && c <= '9') {
			System.out.println(c + "는(은) 숫자입니다");
		}
		if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
			System.out.println(c + "는(은) 기타문자입니다");
		}

	}

}
