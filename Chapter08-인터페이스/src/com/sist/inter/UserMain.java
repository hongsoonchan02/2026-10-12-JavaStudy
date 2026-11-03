package com.sist.inter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMain {
	
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.print("메뉴 선택 : (게시판 = 1, 회원가입 = 2, 로그린 = 3, 목록 = 4, 상세보기 = 5)");
		int menu = scan.nextInt();
		Map map = new HashMap();
		map.put("1", new 게시판());
		map.put("2", new 회원가입());
		map.put("3", new 로그인());
		map.put("4", new 맛집목록());
		map.put("5", new 맛집상세보기());
		
		Execute e = (Execute)map.get(String.valueOf(menu));
		e.execute();
	}

}
