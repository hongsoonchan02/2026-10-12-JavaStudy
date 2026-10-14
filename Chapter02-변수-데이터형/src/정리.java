/*
 * 	1. JVM
 * 	   일반 프로그램
 * 		 
 * 		 프로그램
 * 		   |
 * 		 운영체재 => API
 * 		   |
 * 		 하드웨어
 * 
 * 		자바 프로그램
 *
 *		 프로그램   
 *		   |
 *	  ------------
 *		JVM : JDK => 통신 역할 => 실행 속도가 늦다
 *	  ------------
 *		   |
 *		 운영체제
 *	  	   |
 *		 하드웨어
 *
 *	  JDK의 구성 요소
 *	  ------------
 *		 JRE : 실행환경 => 라이브러리 포함
 *		 ---
 *		 JVM
 *		 - javac 컴파일 => 컴퓨터 인식언어
 *		 - java : 프로그램 실행 => 화면 출력
 *				  소스를 한줄씩 읽어서 출력 => 인터프리터
 *					=> HTML/CSS/JavaScript
 *		 - javap : 역컴파일러
 *				   .java ===> .class를
 *				   .class ===> .java
 *							   -------- 내용은 보여주지 않는다
 *		 - javaw : 서버 구동 => 톰캣 (웹 서버)
 *		 - jar : 배포 * (zip)
 *			| => .class만 모아서 배포
 *		 ---
 *		 Library : 자바에서 제공하는 기능
 *		구동
 *
 *		개발 (개발자용)    javac  컴퓨터가 인식하는 언어  java
 *			A.java -------------- A.class --------------- JVM ---- 화면 출력
 *						|						|
 *						------------------------
 *							이클립스 : ctrl + f11
 *		이클립스는 소스 코딩시마다 컴파일 => 에러를 바로 출력
 *
 *		자바로 제작할 수 있는 프로그램
 *		1. 모바일 : J2ME => 안드로이드, 아이폰 : 스위프트 => 통합 : 플루터 / React Native
 *		2. 게임 : swing / javafx / java3d
 *		3. 웹 => Spring
 *				=> java / kotlin(자바 가상머신)
 *		소스 코딩
 *		1. class명과 파일명이 동일
 *		   	class A
 *			{
 *			}
 *			public class B => B.java
 *			{
 *			}
 *
 *			class A
 *			{
 *			}
 *			class B
 *			{
 *				main(){}
 *			}
 *		2. 반드시 main을 포함해야 실행된다
 *				----- 시작점
 *		3. 프로그램은 명령문을 컴퓨터가 수행하게 만든다
 *				   ----- ;
 *				   | => 순서 
 *		4. 주석
 *			// => ctrl + /
 *			여러 => ctrl + shift + / => ctrl + shift + \
 */
public class 정리 {
	 public static void main(String[] args) {
		
	}

}
