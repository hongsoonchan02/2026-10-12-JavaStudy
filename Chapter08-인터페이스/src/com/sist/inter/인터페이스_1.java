package com.sist.inter;
/*
 * 	인터페이스 : 연결 (리모콘)
 * 		1) 추상클래스의 일종이다 (인터페이스도 클래스와 동일하게 취급)
 * 							상속 내리면 / 상위 클래스
 * 							=> 클래스 여러개를 묶어서 한개 이름으로 관리
 * 		   예)
 * 				List
 * 				 |
 * 	      -----------------------------
 * 		  |          |        |      |
 * 	   ArrayList LinkedList Vector Queue
 * 		
 * 		List list = new ArrayList() 데이터베이스
 * 		list = new LinkedList() 파일
 * 		list = new Vector() 네트워크
 * 
 * 		2) 다중 상속이 가능 (추상클래스 => 단일 상속)
 * 		3) 구성요소 (인터페이스 => only public)
 * 
 * 		4) 역할
 * 		   서로 다른 클래스를 모아서 한개의 이름 관리
 * 		5) 결합성이 낮은 프로그램
 * 		   => 유지보수에 사용하기 좋다 	
 * 		   => 인터페이스를 수정하면 관련된 모든 클래스가 오류 발생
 * 			  고정해서 사용 => 최근에는 default
 *  	6) 인터페이스는 변수(X) => 상수
 *  	7) 다중 상속이 가능
 *  	8) 상속을 내려서 => 오버라이딩을 사용한다
 *  	9) 인터페이스 ===> 인터페이스
 *  			 extends
 *  	   인터페이스 ===> 클래스
 *  			implements
 *  	      클래스 ===> 인터페이스
 *  			  불가 X
 * 		10) 다중 상속시에는 ,
 * 			interface A
 * 			interface B extends A
 * 			interface C extends B
 * 
 * 			interface C extends A, B
 * 
 * 			interface A 
 * 			interface B
 * 			class C implements A, B
 * 
 * 			interface A
 * 			interface B
 * 			class C
 * 			class D extends C implements A, B
 * 
 * 								  |
 * 							   오버라이딩
 * 							1) 상속이 있는 경우
 * 							2) 메소드명이 동일
 * 							3) 매개변수 동일
 * 							4) 리턴형 동일
 * 							5) 접근 지정어는 같거나 확장이 가능
 * 							   -----------------------
 * 							   인터페이스 only public
 * 			interface A {
 * 				int a; => 상수 반드시 값을 등록
 * 				int a = 100;
 * 				void display(); => public 생략 
 * 			}
 * 			class B implements A {
 * 				public void display() {}
 * 			}
 * 
 * 			11) 인터페이스 사용
 * 				1) 윈도우 : 이벤트
 * 				2) 쓰레드 : 동작에 대한 개발
 * 				---------------------
 * 				3) 데이터베이스
 * 				4) 웹 연동/ 앱 연동
 * 				---------------------
 * 
 * 			12) 설계, 요구사항 => 이카텍쳐 => 사이버다임
 * 				데이터베이스 => DBA
 * 				구현 ==== 웹개발
 * 						  | = Front-End
 * 						  | = Back-End
 * 				테스트 ==== 테스터
 * 
 */
public class 인터페이스_1 {

}
