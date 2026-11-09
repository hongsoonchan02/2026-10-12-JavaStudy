package com.sist.string;
/*
 * 		문자 갯수 : length
 * 		문자 분해 : split / StringTokenizer
 *      문자 찾기 : indexOf / lastIndex
 *      문자 자르기 : substring(int start) / substring(int start, int end)
 *                                                             end -1
 *      공백 제거 : trim()
 *      문자열 변환 : valueOf()
 *      문자 변경 : replace()
 *      비교 : equals / contains / startsWith
 */
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String category = "https://www.genie.co.kr/chart/genre";
		String s = category.substring(category.lastIndexOf("/") + 1);
		System.out.println(s);
		s = category.substring(0, category.indexOf(":"));
		System.out.println(s);
		s = category.substring(category.indexOf("/") + 2);
		String s1 = s.substring(0, s.indexOf("/"));
		System.out.println(s1);
		
		String msg1 = "Hello Java";
		String msg2 = "HELLO JAVA";
		
		if(msg1.equalsIgnoreCase(msg2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String msg = "Hello Java";
		if(msg.contains("java")) { // 검색
			
			System.out.println("포함됨");
		}
		if(msg.startsWith("Hello")) { // 자동 완성기
			
			System.out.println("Hello로 시작됨");
		}
		if(msg.endsWith("Java")) { // 확장자 
			
			System.out.println("Java로 끝남");
		}

	}

}
