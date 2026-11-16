package com.sist.etc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator_2 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("포도");
		set.add("바나나");
		set.add("참외");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
