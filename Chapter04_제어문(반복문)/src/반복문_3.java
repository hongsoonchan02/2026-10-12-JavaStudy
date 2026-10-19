// 사용자의 입력값을 받아서 구구단

import java.util.Scanner;

public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력(2~9) : ");
		int dan = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

}
