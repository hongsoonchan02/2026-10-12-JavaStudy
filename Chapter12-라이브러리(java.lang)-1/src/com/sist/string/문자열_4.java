package com.sist.string;

import java.util.StringTokenizer;

public class 문자열_4 {
	
	public static void main(String[] args) {
		
		String color = "red|green|blue|black|white";
		color.replaceAll("", "");
		String[] colors = color.split("\\|"); // String regex
		/*
		 * 		^ : 제외
		 * 		| : 선택
		 * 		? : 0, 1
		 * 		+ : 1개 이상
		 * 		* : 0개 이상
		 * 		. : 임의 한글자
		 */
		
		for(String c : colors) {
			
			System.out.println(c);
		}
		StringTokenizer st = new StringTokenizer(color, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
