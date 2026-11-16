package com.sist.etc;

import java.util.Stack;

// LIFO : 후입선출
public class Stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>();
		s.push("사과");
		s.push("배");
		s.push("포도");
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop()); // 포도
		System.out.println(s.pop()); // 배
		System.out.println(s.pop()); // 사과
	}

}
