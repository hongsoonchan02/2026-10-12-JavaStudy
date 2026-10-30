package com.sist.manager;
/*
 * 	자바 프로그램의 구조
 * 
 * 	1. package : 폴더 구조
 * 	   => 관련된 클래스를 쉽게 찾기 위해서 저장 
 * 	   => 다른 패키지에서 사용을 하려면 => 접근지정어
 * 	   => 접근지정어 (접근 범위)
 * 		  ----------------
 * 		  클래스 : 모든 패키지에서 사용
 * 				 public class ClassName
 * 		  메소드 : 모든 패키지에서 사용
 * 					객체와 객체의 통신
 * 				 public 리턴형 메소드명(매개변수...)
 * 		  생성자 : 모든 패키지에서 사용
 * 				 public 생성자()
 * 		  -----------------------------------
 * 		  변수 : 모든 패키지에서 사용
 * 			    은닉화 : private
 * 				---------------- 기능 공개 public
 * 				=> 읽기 / 쓰기 => 메소드 public
 * 	2. import : 라이브러리 / 사용자 정의 클래스
 * 							| => 패키지가 다르면 import를 사용해서 가지고 온다.
 * 				=> import 여러개 사용이 가능
 * 				=> import java.util.Scanner
 * 									-------
 * 						  java.util.*
 * 						  ----------- 여러개 클래스가 가지고 올 경우
 * 						  => 3개 이상이면
 * 
 * 	공통으로 사용 기능 : 모아서 재사용
 * 		=> 반복 제거
 * 		=> 확장
 * 		=> 유지보수가 쉽다
 * 		=> 가독성 좋다
 * 		=> 상속 / 포함
 * 	
 * 	필요시에는 기능 변경 / 추가하여 사용
 * 	 		다형성
 * 
 * 	관련된 클래스는 한개로 묶어서 제어 => 추상화 
 * 
 * 	상속
 * 	 = extends : 확장해서 사용
 * 	   class A extends B
 * 			---       --- 상속을 내리는 클래스 (부모, super 클래스)
 * 		    상속을 받는 클래스 (자식, sub 클래스, 파생 클래스)
 * 	 = 자바 상속은 단일 상속만 가능
 * 	 = 상속이 안되는 것
 * 	   static : 공통으로 사용이 가능
 * 	   생성자 / 초기화 블록
 * 	   *** private은 상속은 된다 => 사용할 수 없다
 * 		   -----------------
 * 		   | => protected : 상속받는 클래스까지 사용이 가능
 * 	 = 공통으로 사용되는 변수/메소드를 모아서 재사용을 할 수 있게 만든다.
 */
class Animal {
	
	int age = 10;
	public void eat() {
		System.out.println("먹는다");
	}
	public void run() {
		System.out.println("걷는다");
	}
}
// age, eat(), run()
class Pig extends Animal {
	// 재정의 => 오버라이딩
	/*
	 * 	조건
	 * 	 1. 상속을 받은 클래스
	 * 	 2. 메서드명이 동일
	 * 	 3. 매개변수가 동일
	 * 	 4. 리천형이 동일
	 * 	 5. 확장은 가능 / 축소는 불가능
	 * 		접근 지정어
	 */
	public Pig() {
		age = 5;
	}
	  
	public void eat() {
		System.out.println("돼지처럼 먹는다");
	}
	public void run() {
		System.out.println("돼지처럼 걷는다");
	}
	
}

class Dog extends Animal {
	
	public Dog() {
		age = 3;
	}
	
	public void eat() {
		System.out.println("개처럼 먹는다");
	}
	public void run() {
		System.out.println("개럼 걷는다");
	}
}

class Horse extends Animal {
	
	public Horse() {
		age = 7;
	}
	
	public void eat() {
		System.out.println("말처럼 먹는다");
	}
	public void run() {
		System.out.println("말처럼 걷는다");
	}
}
public class 상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal pig = new Pig();
		System.out.println("나이 : " + pig.age);
		pig.eat();
		pig.run();
		
		Animal dog = new Dog();
		System.out.println("나이 : " + dog.age);
		dog.eat();
		dog.run();
		
		Animal horse = new Horse();
		System.out.println("나이 : " + horse.age);
		horse.eat();
		horse.run();
	}

	
}
