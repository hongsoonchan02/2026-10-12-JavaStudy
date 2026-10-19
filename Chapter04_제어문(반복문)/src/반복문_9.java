// 한개의 정수를 받아서 1부터 시작해서 입력받은 정수까지의 합을 출력

import java.util.Scanner;

public class 반복문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. : ");
		int num = scan.nextInt();
		
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		/*
		 * 	반복문
		 * 		초기값 : 어디부터 시작
		 * 		조건식 : 어디까지
		 * 		증가식 : 몇번 수행
		 * 		--------------------- 어떤 문장을 반복 수행할지
		 */
	}

}
