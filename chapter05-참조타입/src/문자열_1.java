/*	
 * 	데이터형
 * 
 *	1. 기본형
 * 	- 정수:byte/int/long
 * 	- 실수:double => (SpringAI = float)
 * 	- 논리:boolean
 * 	- 문자:char ==> String으로 대체
 * 
 * 	2. 참조형
 * 	- 기본형
 * 	- 참조형
 * 
 * 	String	
 * 
 *	String 클래스 => char[]을 제어
 *	String => "" / char => ''
 *	변경해서 사용이 불가능 / 제공한 내용을 사용 => 표준화 final
 *	지원하는 메소드를 사용할 수 있다.
 *	같은 문자열은 주소가 동일하다
 *	- 새로운 메모리 공간 => new String("");
 *	변수는 Stack, 리터럴은 Heap에 저장된다.
 *
 * 	메소드
 * 	1. charAt() : 원하는 위치의 문자를 추출
 * 	2. length() : 문자의 갯수
 * 	3. 비교
 *	    - equals() : ==
 *		- equalsIgnoreCase() : 대소문자 구분 없이 비교
 *		- contains() : 포함된 문자열 ***
 *		- startsWith() : 시작 문자열이 같은 경우
 *		- endsWith() : 끝문자열이 같은 경우
 */

import javax.swing.JOptionPane;

public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String msg = "Hello Java";
//		
//		System.out.println(msg.charAt(6));
//		System.out.println(msg.length());
//		
//		int count = 0;
//		for(int i=0;i<msg.length();i++) {
////			System.out.print(msg.charAt(i));
//			char c = msg.charAt(i);
//			if(c == 'a' || c == 'A') {
//				count++;
//			}
//		}
//		System.out.println("A, a의 갯수 : " + count);

		String myId = "hong";
		String myPwd = "1234";
		
		String id = JOptionPane.showInputDialog("아이디 입력 : ");
		String pwd = JOptionPane.showInputDialog("비밀번호 입력: ");
		
		if(id.equalsIgnoreCase(myId) && pwd.equals(myPwd)) {
			
			JOptionPane.showMessageDialog(null, "로그인되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀립니다.");
		}
		
	}
}
