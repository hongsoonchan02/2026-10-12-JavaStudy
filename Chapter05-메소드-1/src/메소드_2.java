// 사칙연산

import java.util.Scanner;

public class 메소드_2 {
	
	static int plus(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int gop(int a, int b) {
		return a * b;
	}
	
	static String div(int a, int b) {
		if(b == 0) {
			return "0으로 나눌 수 없습니다.";
		} else {
			return String.valueOf(a/(double)b);
		}
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = scan.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /) : ");
		
		switch(scan.next()) {
		
		case "+" -> System.out.println(a + " + " + b + " = " + plus(a, b));
		case "-" -> System.out.println(a + " - " + b + " = " + minus(a, b));
		case "*" -> System.out.println(a + " * " + b + " = " + gop(a, b));
		case "/" -> System.out.println(div(a, b));
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
