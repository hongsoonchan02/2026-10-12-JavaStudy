/*
 * 		/ , %, 비트연산자, 비트이동 연산자
 * 			   -------  ----------
 * 			   & | ^	  << , >> 
 */
import java.util.Scanner;
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		int a = 10;
		int b = 0;
		System.out.println(b == 0 ? "0으로 나눌 수 없습니다." : a / b);
		
		System.out.println("============== % ===============");
		System.out.println("5 % 2 = " + 5 % 2);
		System.out.println("5 % -2 = " + 5 % -2);
		System.out.println("-5 % 2 = " + -5 % 2);
		System.out.println("-5 % -2 = " + -5 % -2);
		
		int won = 789;
		int w100 = won / 100;
		int w10 = (won % 100) / 10;
		int w1 = won % 10;
		
		System.out.println(w100);
		System.out.println(w10);
		System.out.println(w1);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.println(num % 2 == 0 ? num + "은(는) 짝수입니다" : num + "은(는) 홀수입니다.");
		
		

	}

}
