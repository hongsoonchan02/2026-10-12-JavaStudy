// 변수 선언 / 초기값 설정
/*
 * 	선언 ==> 난수 / 사용자로부터 값을 받아서 초기화
 * 		=> 데이터형 변수명;
 * 	값 설정
 * 		=> 변수명 = 값
 * 	선언과 동시에 값 설정
 * 		=> 데이터형 변수명 = 값 => 묵시적 초기화
 * 		---------------
 * 		=> 지역변수
 * 		   지역변수는 반드시 초기화 후에 사용
 */
import java.util.Scanner;
public class 변수2 {
	// 멤버변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수
//		int a = (int)(Math.random()*100)+1;
//		System.out.println(a);

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a =scan.nextInt();
		// 입력된 데이터를 가지고 온다 => a라는 메모리 공간에 저장
		System.out.println(a);
		// 저장된 값을 출력
	}

}
