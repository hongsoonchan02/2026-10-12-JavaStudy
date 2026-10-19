/*
 * 		1. 변수 : 한개의 데이터 저장하는 메모리 공간의 이름
 * 				 --------- 
 * 				 메모리 크기
 * 				=> 데이터형 (자료형)
 * 				------------------
 * 						|
 * 				------------------
 * 				|				 |
 * 			기본형(자바 지원)   참조형(사용자 정의) = 배열 / 클래스
 * 				|
 * 			장수
 * 			
 * 			*** 낮은 버전 / 높은 버전
 * 				------   -------
 * 
 * 		= 반복문
 * 		  for       : 반복 횟수 지정
 * 					  => 화면 UI / 페이지 나누기 / 배열 / 컬렉션
 * 											------------ 
 * 											| 고정 | 가변
 * 										 	데이터 여러개를 모아서 관리
 * 	 	  while     : 반복 횟수가 없는 경우
 * 				   	  => Backend-End / 데이터베이스 연동 / 게임
 * 		  do~while  : 1번이상 반드시 반복
 * 					  => 자바에서는 사용 빈도가 거의 없다
 * 		  = 반복 제어문 : 반복 중단 / 반복을 건너뛴다
 * 					   break;   continue;
 * 
 * 	for(int 1=1;i<3;i++)
 * 	{
 * 		System.out.pringln(i);
 * 	}
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======== 대문자 ========");
		for (char c = 'A'; c <= 'Z'; c++) {
			
			System.out.print(c);
		} // c 변수는 자동으로 소멸
		System.out.println("======== 소문자 =========");
		
		for (char c = 'a'; c <= 'z'; c++) {
			
			System.out.print(c);
			
		}
		System.out.println("\n======= 대문자 거꾸로 =======");
		for (char c = 'Z'; c >= 'A'; c--) {
			
			System.out.print(c);
		}
		
		System.out.println("\n======= 소문자 거꾸로 =======");
		for (char c = 'z'; c >= 'a'; c--) {
			
			System.out.print(c);
		}
		System.out.println("\n===== 1~10까지 출력 =====");
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i);
		}
		System.out.println("\n===== 짝수만 출력 =====");
		for (int i = 1; i <= 10; i+=2) {
			
			System.out.print(i);
		}

	}

}
