package com.sist.collection;

import java.util.ArrayList;
import java.util.Collections;

/*
 *    기본 : CRUD
 *          add / get / set / remove
 *    기능 : 두개 이상의 List에서 중복된 데이터 관리 = JOIN
 *          => 멜론 / 지니뮤직
 *          => UNION (합집합) 중복 제거
 *             => containsAll()
 *          => INTERSECT (교집합)
 *             => retainAll()
 *          => UNIONALL (합집합) 중복 허용
 *             => addAll()
 *          => MINUS (차집합)
 *          => 부분적 복사
 *             => subList()
 *             
 *           -----------------------------
 *           ArrayList / Vector / LinkedList => List
 *                                   | 파일
 *                        | 네트워크 (쓰레드)
 *            | 데이터베이스 연동 => 웹에서 가장 많이 사용
 */
public class Collection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// => 데이터 첨부 : 모든 데이터가 저장 가능 => Object
		list.add(3); // 0
		list.add(4); // 1
		list.add(8); // 2
		list.add(7); // 3
		list.add(9); // 4
		list.add(1); // 5
		list.add(2); // 6
		list.add(6); // 7
		list.add(5); // 8
		
		System.out.println("====== 일부만 추출 ======");
		ArrayList list2 = new ArrayList(list.subList(1, 4)); // 4, 8, 7
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		for(int i = 0; i < list2.size(); i++) {
			
			int num = (int)list2.get(i);
			System.out.println(num);
		}
		
		
		System.out.println("====== 데이터 출력 ======");
		for(int i = 0; i < list.size(); i++) {
			
			int num = (int)list.get(i);
			System.out.println(num);
		}
		System.out.println("====== 데이터 정렬 =======");
		Collections.sort(list); // Arrays.sort(배열명)
		for(int i = 0; i < list.size(); i++) {
			
			int num = (int)list.get(i);
			System.out.println(num);
		}
		
		System.out.println("====== 같은 데이터 추출 ======");
		// 교집합
		list.retainAll(list2);
		for(int i = 0; i < list.size(); i++) {
			
			int num = (int)list.get(i);
			System.out.println(num);
		}
		System.out.println("====== 전체 복사 =======");
		ArrayList list3 = new ArrayList();
		
		list3.addAll(list2);
		for(int i = 0; i < list3.size(); i++) {
			
			int num = (int)list3.get(i);
			System.out.println(num);
		}
		System.out.println("=========");
		
		list.containsAll(list3);
		for(int i = 0; i < list.size(); i++) {
			
			int num = (int)list.get(i);
			System.out.println(num);
		}
	}

}
