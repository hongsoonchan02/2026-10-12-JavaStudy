package com.sist.thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MusicVO {
	
	private int mno;
	private String title;
	
	public MusicVO(int mno, String title) {
		
		this.mno = mno;
		this.title = title;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// => 오버라이딩이 가장 많은 메소드 => 객체 주소 (변수의 초기화)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mno + ":" + title;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		
		List<MusicVO> list = new ArrayList<MusicVO>();
		
		list.add(new MusicVO(2, "아이유"));
		list.add(new MusicVO(3, "리센느"));
		list.add(new MusicVO(1, "아일릿"));
		
		System.out.println(list);
		
		list.sort(Comparator.comparingInt(MusicVO::getMno));
		System.out.println(list);
		// MusicVO::getTitle => 메소드 참조
		list.sort(Comparator.comparing(MusicVO::getTitle));
		System.out.println(list);
		// 내림차순
		list.sort(Comparator.comparingInt(MusicVO::getMno).reversed());
		System.out.println(list);
		
	}
}
