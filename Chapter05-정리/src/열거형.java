// 상수를 쉽게 관리하는 클래스 일종
/*
 *	enum 전화번호 {
 *		서울("02"),
 *		..
 *		..
 *		..
 *		..
 *		..
 *	}
 *
 *	=> 정해진 값 하나를 선택해 사용
 *	   ------- 상수
 *	   예) 요일, 주문 상태, 사용자 권한, 결제 상태
 *	   enum Week{
 *	     일요일, 월요일 ....
 *	   }
 */

import java.util.Scanner;

enum 전화국번 {
	서울("02"),
	강원도("123");
	
	String code;
	전화국번(String code) {
		this.code = code;
	}
	String getCode() {
		return code;
	}
}
public class 열거형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("지역 입력 : ");
		String loc = scan.next();
		
		for(전화국번 n : 전화국번.values()) {
			if(n.name().contains(loc)) {
				System.out.println(loc + "의 국번은 " + n.getCode());
			}
		}
	}

}
