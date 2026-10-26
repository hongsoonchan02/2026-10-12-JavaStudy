/*
 *	메소드 : 여러개 기능을 만들어서 => 조립
 *	----
 *	  리턴형 / 매개변수 => 메소드명은 의미
 *	  라이브러리 => 메소드만
 *	  => 사용자 => id, pwd => 로그인 여부 확인
 *							-----------
 *							  boolean
 */

import java.util.Scanner;

public class 메소드_4 {

	static boolean isLogin(String id, String pwd) {
		final String MID = "Hong";
		final String PWD = "1234";
		
		boolean bCheck = false;
		
		if(id.equals(MID) && pwd.equals(PWD)) {
			bCheck = true;
		}
		
		return bCheck;
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = scan.next();
		System.out.print("PWD 입력 : ");
		String pwd = scan.next();
		
		boolean bCheck = isLogin(id, pwd);
		
		if(bCheck == true) {
			System.out.println("(로그인 완료) Main Page로 이동!!");
		} else {
			System.out.println("아이디나 비밀번호가 틀립니다!! 다시 입력하세요.");
			process();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
