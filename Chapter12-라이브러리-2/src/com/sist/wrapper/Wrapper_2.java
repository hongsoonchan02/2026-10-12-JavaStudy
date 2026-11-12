package com.sist.wrapper;
/*
 *    int Integer / double Double / boolean / Boolean
 *    => float Float => Spring AI
 *    => 유사도 검사
 *       ======== 문자를 float로 변경 => RAG
 *    char[] => String 
 *    
 *    => Wrapper는 기본형 / 클래스
 */
public class Wrapper_2 {

	public static void main(String[] args) {
		
		double d = 10.5;
		Integer i = (int)d; // Wrapper 클래스의 형변환은 기본형으로 사용
		System.out.println(i);
		/*
		 *   형변환 => 기본형으로 형변환
		 *   정수 변환 : Integer.parseInt("10");
		 *   실수 변환 : Double.parseDouble("10.5");
		 *   논리 변환 : Boolean.parseBoolean("true"); 
		 */
		String[] s = {"100", "20", "1", "5", null};
		
		for(String ss : s) {
			
			if(ss != null) {
				Integer a = Integer.parseInt(ss);
				System.out.println(a);
			}
		}
	}
}
