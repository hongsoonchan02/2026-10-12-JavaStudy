/*
 * 	36page
 * 	변수 => 한개의 데이터를 저장하는 메모리 공간
 * 		   ---------------------------
 * 		   => 모든 프로그램언어는 메모리 => RAM에 저장
 * 									 -------- 프로그램 종류시 해제
 * 		|
 * 	   파일
 * 		|
 * 	  오라클 : 영구적인 저장 장치 / MySQL / PostgreSQL
 * 	  ------------------------------------------
 * 
 * 	  메모리 크기 => 데이형 (자료형)
 * 	  기본형 / 참조형 (사용자 정의)
 * 			   => 배열 / 클래스
 * 		| 자바에서 제공하는 데이터형
 * 		  -------------------
 * 		  정수
 * 			byte (1byte => 8bit) 0, 1 => 8개까지 저장이 가능
 * 				 -----------------
 * 				  1 1 1 1 1 1 1 1
 * 				 -----------------
 * 			short
 * 			int
 * 			long
 * 		  실수
 * 			float (4byte, 소수점 : 6자리)
 * 				  VectorDB (AI)
 * 			double (8byte, 소수점 : 15자리)
 * 				  Default => 컴퓨터가 인식 => 건축 설게
 * 		  논리
 * 			boolean : true/false (1byte)
 * 		  문자
 * 			char : 문자 1개
 * 			=> 2byte (0~65535) => 유니코드
 * 				   값 => 'A', '홍'
 *				   여러개 =? "ABC" => String
 *
 *		변수가 없는 프로그램은 존재하지 않는다
 *
 *		변수 설정
 *		데이터형 변수명 = 값 (초기값) 변수 (변하는 수) / 상수
 *		int a = 10;
 *		a = 100;
 *		final int b = 10;
 *		b = 100; 오류
 *
 *		변수 명칭법
 *		1. 알파벳, 한글
 *		   ---- 대소문자 구만 a, A
 *		2. 숫자 사용이 가능
 *		   앞에 사용할 수 없다
 *		   a1 a2 a3... a1b
 *		3. 특수 문자 사용이 가능
 *		   _, $ => _사용이 많다
 *		   1) 임시 변수 _변수명
 *		   2) 단어가 2개 이상인 경우
 *			  file_name 
 *		4. 공백은 사용할 수 없다
 *		   a b
 *		5. 키워드는 사용이 불가능
 *		   ex) int, double, float...
 *		--------------------------------------
 *
 *		약속 사항
 *			| 변수는 소문자로 시작한다
 *			| 상수는 대문자
 *			final double PI = 3.14
 *		캐멀방식
 *			단어 두개 이상
 *			----------
 *				firstName : first_name
 *					--
 *				secondName : second_name
 *
 *		1) 변수 = 저장공간 (값)
 *		   정수 
 *			= 10, 20 ... 10진법
 *			= 007        8진법
 *			= 0xFF       16진법
 *			= 0b0101     2진법
 *
 *		---------------------------------------------------------
 *		변수 선언 방법
 *		데이터형 변수명 = 값;
 *		예)
 *			국어점수
 *			int kor = 80;
 *			영어점수
 *			int eng = 78;
 *			수학점수
 *			int math = 90;
 *			총점
 *			int total = 90;
 *			평균
 *			double avg = 89.0
 *			이름
 *			char c1 = '홍';
 *			chat c2 = '길';
 *			char c3 = '동';
 *			------------------- String name = "홍길동";
 *			데이터형의 크기
 *			byte < char < int < long < float < double
 *
 *			1) 작은 데이터형에는 큰 값을 저장할 수 없다
 *				int a = 10L; 오류
 *			2) 큰 데이터형에는 작은 값을 저장할 수 있다
 *				Long a = 10; 가능
 */

public class 변수 {
	public static void main(String[] args) {
//		System.out.println(Integer.toHexString(10));
//		byte b = (byte)300;
//		System.out.println(b);
//		int 사과 = 10;
//		int 먹은사과 = 5;
//		System.out.println("남은사과 : " + (사과 - 먹은사과));
		byte byteValue = 127;
		int intValue = 10;
		long longValue = 10L;
		float floatValue = 10.5f;
		double doubleValue = 10.5D; //D는 생략이 가능
		boolean booleanValue = true;
		char charValue = 'A';
		
		System.out.println("byteValue = " + byteValue);
		System.out.println("intValue = " + intValue);
		System.out.println("longValue = " + longValue);
		
		// 작은 값 지정
		double d = 100; // 자동 형변환 => 큰 데이터형으로 
		System.out.println("d = " + d);
		
		int a = 97; // A = 65, a = 97;
		System.out.println((char)a);
		char c = '0'; // '0' => 48
		// 저장 => 문자(x) , 문자에 해당되는 숫자 저장 => 유니코드
		System.out.println((int)c);
		System.out.println((int)'대');
		System.out.println((int)'파');
		
		// 예외 : boolean은 적용이 안된다 => 숫자 (char는 정수)
		// 메모리에 한개의 데이터만 저장
		/*
		 * 	정수 : int
		 * 	실수 : double
		 * 	존재 : boolean
		 * ----------------
		 * 	long : AI, 테이터가 많은 경우
		 * 	전송 (네트워크) => byte
		 * 
		 * 	형변환 => 데이터형을 변경
		 * 	자동 형변환 : UpCasting
		 * 		작은 데이터를 큰데이터에 저장
		 * 		long a = 10
		 * 				--- long으로 변경
		 * 		double d = 10L
		 * 				---- double로 변경 10.0
		 * 	강제 형변환 => DownCasting
		 * 		int a = 10.5
		 * 		
		 */
		
		
	}

}
