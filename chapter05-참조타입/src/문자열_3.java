// 변환
/*
 * 	toUpperCase() => 개문자 변환
 * 	toLowerCase() => 소문자 변환
 * 	replace() => 문자 변경
 * 	replaceAll() => 정규식
 * 	   한글 전체 /  알파벳 전체 / 숫자 전체
 * 		[가-힣]    [A-Za-z]    [0-9]
 * 	=> 문자변경 / 문자열 변경
 * 
 * 	IP
 * 		[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}
 */

import java.util.Scanner;

public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("알파벳 입력 : ");
//		String alpha = scan.nextLine();
//		/*
//		 * 	nextLine() ABCD EFG
//		 * 	next() ABCD EFG
//		 */
//		System.out.println(alpha.toUpperCase());
//		System.out.println(alpha.toLowerCase());
		
		String msg = "Hello Java!!";
		System.out.println(msg.replace('a', 'b'));
		System.out.println(msg);
		System.out.println(msg.replace("Java", "Oracle"));
		
		String s = "ABCD가나다라12345";
		System.out.println(s.replaceAll("[가-힣]", ""));
		System.out.println(s.replaceAll("[A-Z]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println(s.replaceAll("[^가-힣]", ""));

	}

}
