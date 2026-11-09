package com.sist.string;
// 문자열 분리 => split / StringTokenizer

import java.util.StringTokenizer;

/*
 * 
 * 	만두, 식용유, 설탕, 맛술, 물엿, 고추장, 케찹, 물
 * 
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="만두,식용유,설탕,맛술,물엿,고추장,케찹,물";
		String[] datas = data.split(",");
		
		for(String s : datas) {
			
			System.out.println(s);
		}
		
		System.out.println();
		StringTokenizer st = new StringTokenizer(data, ",");
		System.out.println("분리된 재료 : " + st.countTokens());
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
		/*
		 * 	countTokens() : 분리된 단어 갯수
		 * 	hasMoreTokens() : 분리된 단어가 있는 동안
		 * 	nextToken() : 실제 단어를 한개씩 읽어온다
		 * 	단점 : ""공백 / null인 경우에는 문제가 발생
		 */

	}

}
