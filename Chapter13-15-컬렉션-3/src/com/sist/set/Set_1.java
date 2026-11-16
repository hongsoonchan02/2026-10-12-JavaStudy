package com.sist.set;

import java.util.HashSet;

public class Set_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("귤");
		set.add("감");
		set.add("사과");
		
		System.out.println(set.size());
		
		for(String f : set) {
			System.out.println(f);
		}
		
		set.remove("사과");
		for(String f : set) {
			System.out.println(f);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("과일이 없습니다.");
		} else {
			System.out.println("과일이 있습니다.");
		}
		
		/*
		 *   단점
		 *    객체 단위 저장 => 같은 이름이 있는 경우에는 제거할 수 없다
		 *    JSP, Servlet, Spring. SPringBoot (X)
		 *    만약 사용 : WebSocket을 이용한 접속자 정보
		 *    TreeSet ==> 오라클에도 존재
		 */
		
	}
}
