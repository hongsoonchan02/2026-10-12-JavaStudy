package com.sist.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < 10; i++) {
//			
//			int a = (int)(Math.random() * 10) + 1;
//			list.add(a);
//		}
//		
//		System.out.println("====== 목록 출력 ======");
//		System.out.println(list);
//		Collections.sort(list); // 배열은 Arrays.sort()
//		System.out.println("====== 정렬 후 ======");
//		System.out.println(list);
//		
//		List<String> list2 = new ArrayList<String>();
//		list2.add("홍길동");
//		list2.add("박문수");
//		list2.add("심청이");
//		list2.add("강감찬");
//		list2.add("이순신");
//		Collections.sort(list2);
//		System.out.println(list2); // ASC
		
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("참외");
		list.add("수박");
		list.add("바나나");
		// Iterator
		Iterator<String> it = list.iterator();
		// 데이터 출력
		while(it.hasNext()) {
			
			String f = it.next();
			if(f.equals("참외")) {
				it.remove();
			}
			System.out.println(f);
		}
		System.out.println(list);
		// Set / Map
		
	}
}
