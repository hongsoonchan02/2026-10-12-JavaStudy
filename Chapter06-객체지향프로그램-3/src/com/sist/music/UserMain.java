package com.sist.music;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music = new GenieMusic();
		// 목록 출력
		MusicVO[] list = music.musicListData();
		for(MusicVO vo : list) {
			System.out.println(vo.getRank() + ". " + vo.getTitle());
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("노래 제목 입력 : ");
		String title = scan.next();
		
		list = music.musicSearchTitle(title);
		System.out.println("총 검색 수 : " + list.length);
		
		for(MusicVO vo : list) {
			System.out.println(vo.getRank() + ". " + vo.getTitle());
		}
		
		System.out.print("가수 제목 입력 : ");
		String singer = scan.next();
		
		list = music.musicSearchSinger(singer);
		System.out.println("총 검색 수 : " + list.length);
		
		for(MusicVO vo : list) {
			System.out.println(vo.getRank() + ". " + vo.getTitle() + ". " + vo.getSinger());
		}

	}

}

