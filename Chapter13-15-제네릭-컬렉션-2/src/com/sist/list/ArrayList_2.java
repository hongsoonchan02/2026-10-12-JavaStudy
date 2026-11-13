package com.sist.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {
				"홍길동", "이순신", "박문수", "심청이", "춘향이"
		};
		
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(names);
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
