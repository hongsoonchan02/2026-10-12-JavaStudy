package com.sist.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// => 1. ArrayList / 2. HashMap 자주 사용함
// Random => 원하는 부분의 난수 발생이 가능 => nextInt(100) 0 ~ 99
// 형변환 없이 사용
public class Set_6 {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			int k = r.nextInt(100) + 1; // 빈 공백이면 int 전체 범위
			set.add(k);
		}
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.addAll(set);
		System.out.println("===== 전체 데이터 ======");
		for(int i : tSet) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n*****===== 50 이상 =====");
		System.out.println(tSet.tailSet(50));
		System.out.println("*****===== 50 이하 =====");
		System.out.println(tSet.headSet(50));
		System.out.println("===== 바로 위에 값 ======");
		System.out.println(tSet.higher(30));
		System.out.println("===== 바로 밑에 값 ======");
		System.out.println(tSet.lower(30));
		System.out.println("===== 같거나 큰 값 ======");
		System.out.println(tSet.ceiling(50));
		System.out.println("===== 같거나 작은 값 ======");
		System.out.println(tSet.floor(50));
		System.out.println(tSet.first());
		System.out.println(tSet.last());
	}
}
