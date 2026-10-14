/*
 * 	프로그램
 * 		데이터 저장 === 데이터 가공 === 결과값 화면에 출력
 * 			|            |			    |
 * 									 윈도우 / 도스 => 애플리케이션
 * 									 브라우저 => 웹 애플리케이션
 * 									 핸드폰 => 앱
 * 					 연산자 / 제어몬
 * 				     ------------ + 메소드
 * 		   한개 저장
 * 		   여러개 저장 (같은 데이터형) : 배열
 * 		   여러개 저장 (다은 데이터형) : 클래스
 * 		   ---------------------------- 메모리에 저장 
 * 			|
 * 		   영구적으로 저장
 * 			= 파일
 * 			= RDBMS (오라클) 
 * 
 * 	1. 데이터형(기본형 / 참조형)
 * 		기본형 : 자바에서 제공하는 기본 데이터형
 * 		=> 정수형 (byte, int, long)
 * 		=> 실수형 (float, double)
 * 		=> 논리형 (boolean)
 * 		=> 문자 (char ==> String) 
 * 		참조형 : 사용자 정의 => 직접 메모리 크기  
 * 	2. 변수 선언 = 초기화
 * 	   멤버변수 : 자동으로 초기화 = class {}
 * 	   지역변수 : 메소드안 선언 => 초기화가 없다 : 반드시 초기화 후에 사용
 * 	   						 | 명시적 초기화 int a = 10;
 * 							 | 사용자 입력값 
 * 							 | 난수 
 * 	   초기화 방법
 * 		1) 선언 + 초기화 int age = 20;
 * 					  String name = "홍길동";
 * 		2) 선언후에 초기화 int age; age = 20; // 입력값을 받아서
 * 		3) 여러개 변수 설정 int a = 10; int b = 10; int c = 10; int a, b, c; a=b=c=10;
 * 		4) 초기값을 다른 변수에 대입 int a = 10; int b = a;
 *		5) 값 교체 int a = 10; int b = 20; int c = a; a = b; b = temp;
 *		6) 각 데이터형별 초기화 
 *			int 20 
 *			double 10.5 
 *			float 10.5F 
 *			byte 10 => 구분자가 없다 => 정수 사용 (-128~127) 
 *			boolean true / false
 *			char => 'A' => 한글, 특수문자 => \n, \t, \a 
 *			long => 10L
 *
 *			=> 특수문자
 *				\n ==> newline
 *				\t ==> tap
 * 	3. 연산처리
 * 	   피연산자 / 연산자
 * 		 | 연산 대상
 * 			1개 : 단항연산자
 * 				1) 증감연산자 : ++, -- => 한개 증가 / 한개 감소
 * 				2) 부장연신자 : !
 * 					=> turn
 * 				3) 형변환연산자
 * 					(데이터형) => (int), (char) ....
 * 						=====> 큰데이터 (UpCasting)
 * 					byte < char < int < long < float < double
 * 						<===== 작은 데이터 (DownCasting)
 * 						(char)65 => 'A'
 * 			2개 : 이항연산자
 * 					1) 산술연산자
 * 						+ - * /(나누기) %(나누고 나머지)
 * 						+ => 산술, 문자열 결합 
 * 					2) 비교연산자 => 결과값 : true / false
 * 					   == 같다 6 == 7 : false
 * 					   != 같지 않다
 * 				 	   > 크다 6 > 7 false
 * 					   < 작다 6 < 7 true
 * 					   >= 크거나 같다 6 >= 7 false
 * 					   <= 작거나 같다 6 <= 7 true
 * 					   ===> 기본형 비교는 가능 (문자열, 날짜 불가능)
 * 							"홍" == "홍"
 * 							"홍".equals("홍") => 문자열 메모리 주소
 * 					3) 논리연산자 : &&. ||
 * 						(조건) && (조건)
 * 							&&는 직렬연산자 => 조건이 둘다 true일때만 true / 나머지는 false
 * 							조건    조건
 * 						   true    true ==> true
 * 						   true    false ==> false
 * 						   false   false ==> false
 * 						   false   false ==> false ==> 범위안에 있는 경우
 * 						   score >= 90 && score <= 100
 * 							id && pwd
 * 							||는 병렬연산자 => 조건이 한개이상 true => true
 * 							| => 범위 밖에 있는 경우
 * 							score < 0 || score > 100
 *   						효육적인 연산 : 최적화
 *   						(조건) && (조건)
 *   						----- false
 *   
 *   				4) 대입연산자
 *   					= // a = 10 a라는 변수에 10 대입한다 (x)
 *   							    10을 a라는 변수에 대입한다
 *   						=> Right ==> Left
 *   					복합대입연산자
 *   					+=, -=, *=, /= %= ...
 *   					int a = 10;
 *   					a += 10; ==> a = a + 10 => a = 20
 *   
 *   					a += 10 ==> a = a - 10 => 0
 * 			3개 : 삼항연산자
 * 					(조건) ? 값1 : 값2 조건이 true면 값1, 조건이 false면 값2
 * 	4. 제어문 => 프로그램 제어
 * 	5. 데이터를 모아서 관리 : 배열 / 클래스(사용자 정의)
 * 	6. 명령문을 모아서 관리 : 메소드
 * 	----------------------------------- 기본
 * 	7. 객체지향프로그램 : 체계적으로 모아서 관리 => 재사용
 * 	8. 프로그램이 비정상 종료가 없이 사용 : 예외처리
 * 	----------------------------------- 문법
 * 	9. 자바에서 제공하는 라이브러리
 * 	   외부에서 제공하는 라이브러리 : Jsoup / Json (jackson) / lombok
 * 	------------------------------------------------------------
 * 	=> 데이터 영구적으로 저장 : 오라클
 * 	   ------------------------ Java + 오라클
 * 	=> 브라우저에서 실행 : HTML / CSS / JavaScript
 * 									| Jquery / Vue3 /React
 * 	=> WEB 관련 : JSP
 * 	------------------------------------------------------------
 * 	실무
 * 		1. Spring Boot
 * 		2. Spring Security => JWT
 * 		3. Kafka
 * 		4. WebSocket => Stomp => Redis
 * 		5. Spring AI
 * 		6. CI/CD
 * 			=> Ubuntu / Docker / Docker-compose
 * 			   쿠버네티스 / Jenkins
 * 		7. AWS
 * 		   EC2 / S3 / CloudWatch
 * 		--------------------------------------------------
 * 
 * 		개인프로젝트 : NextJS / NodsJS / TypeScript
 * 		--------> 적극적 취업 / 포트폴리오 / 이력서 (자소서)
 */
public class 연산자종류 {
	public static void main(String[] args) {
		System.out.println("\"홍길동\"");
		System.out.println("c:\\javaDev\\javaStudy");
		int age = 20;
		age = 21;
		System.out.println("age = " + age);
		final int a = 20; // 상수
		System.out.println("5 % 2 = " + (5 % 2));
		System.out.println("5 % -2 = " + (5 % -2));
		System.out.println("-5 % 2 = " + (-5 % 2));
		System.out.println("-5 % -2 = " + (-5 % -2));
	}

}
