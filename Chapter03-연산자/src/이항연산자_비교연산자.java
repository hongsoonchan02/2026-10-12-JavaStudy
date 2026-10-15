/*
 * 	-------
 * 	부정연산자 : ! (반전)
 * 	비교연산자 : ==, !=, <, >, <=, >=
 * 	논리연산자 : &&, ||
 * 	------- 조건문안에 들어가는 연산자 : true/false
 * 	대입연산자 : 계산 결과값
 * 			  =, +=, -=, *=, /= ...
 * 	삼항연산자 : if~else : 조건에 맞는 결과값을 가지고 온다
 * 			  JSP에서주로 사용 / ThymeLeaf => HTML + Java
 * 
 * 	비교연산자 : 조건문 / 반복문에서 주로 사용하는 연산자
 * 		=> byte / char / int / long / float / double : 숫자
 * 		=> boolean : ==, !=
 * 		=> String : equals(), !equals()
 * 					compare(), contains(), startsWith(), endsWith()
 * 
 * 	비교연산자 종류
 * 		=>
 * 			== 같다 		10 == 10
 * 			!= 같지 않다 	10 != 10
 * 			<  작다		10 < 10
 * 			>  크다		10 > 10 ==> 기준은 왼쪽
 * 			<= 작거나 같다	10 <= 10 true 10 < 10 || 10 == 10
 * 			>= 크거나 같다 10 >= 10 true 10 > 10 || 10 == 10
 */
import java.util.Scanner;

public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 'A';
		int b = 65;
		// 기억 => 문자는 연산시에 자동으로 int로 변경
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println("======= 실수 =======");
		
		float f= 10.5F;
		double d = 10.5;
		System.out.println(f == d);
		System.out.println(f != d);
		System.out.println(f < d);
		System.out.println(f > d);
		System.out.println(f <= d);
		System.out.println(f >= d);
		// 데이터형 다른 경루 => 모든 연산은 큰데이터형으로 변경후에 연산


		boolean b1 = true;
		boolean b2 = false;
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		
		String mid = "admin";
		Scanner scan = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = scan.next();
		
		System.out.println(mid.equals(id));
		
		

	}

}
