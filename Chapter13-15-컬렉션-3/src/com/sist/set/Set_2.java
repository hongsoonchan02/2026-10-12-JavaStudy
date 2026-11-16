package com.sist.set;

import java.util.HashSet;
import java.util.Objects;

class Sawon {
	
	private int sabun;
	private String name;
	
	public Sawon() {
		
	}
	
	public Sawon(int sabun, String name) {
		
		this.sabun = sabun;
		this.name = name;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(sabun, name);  // hashcode를 통일 => 같은 객체 인식
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon s = (Sawon)obj;
		return this.name.equals(s.name) && this.sabun == s.sabun;
	}
	
	
	
}
public class Set_2 {

	public static void main(String[] args) {
		HashSet<Sawon> set = new HashSet<Sawon>();
		set.add(new Sawon(1, "홍길동"));
		set.add(new Sawon(1, "홍길동"));
		set.add(new Sawon(2, "박문수"));
		set.add(new Sawon(3, "이순신"));
		set.add(new Sawon(4, "강감찬"));
		set.add(new Sawon(5, "심청이"));
		System.out.println("사원 인원 : " + set.size());
		
		for(Sawon s : set) {
			System.out.println(s.getSabun() + "-" + s.getName());
			
		}
	}
}
