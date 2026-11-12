package com.sist.string;
/*
 *    String : 문자열 변경이 불가능
 * 
 */
public class StringBuilder_2 {

	public static void main(String[] args) {
		
//		StringBuilder sb = new StringBuilder("Java");
		StringBuffer sb = new StringBuffer("Java"); 
		// 문자열 추가
		sb.append(" Hello");
		System.out.println(sb);
		
		// 특정 위치에 추가
		sb.insert(4, "Language");
		System.out.println(sb);
		
		// 삭제
		sb.delete(0, 4);
		System.out.println(sb);
		
		sb.replace(0, 4, "Spring");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(sb);
	}
}
