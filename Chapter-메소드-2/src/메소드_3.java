// boolean

import java.util.Scanner;
// 클래스 => 영화 (한개에 대한 데이터) => new
public class 메소드_3 {
	
	static boolean isLogin(String id, String pwd) {
		if(id.equals("admin") && pwd.equals("1234")) {
			return true; // 메소드 종료
		} else {
			return false; // 메소드 종료
		}
		// 메소드는 종료 시점 => return 있는 곳에서 종료
	}
	/*
	 * 	2가지 경우 수 : boolean
	 * 	여러개 경우의 수 : String
	 * 	목록 : 배열 / 컬렉션
	 * 	상세보기 : 클래스
	 * 	나머지는 기본형
	 * 	----------------------
	 * 	글쓰기 / 회원가입 => 클래스
	 * 	페이지 변경 => int
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("ID, Password 입력 : ");
		String id = scan.next();
		String pwd = scan.next();
		boolean bCheck = isLogin(id, pwd);
		if(bCheck == true) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인 실패했습니다.");
		}

	}

}
