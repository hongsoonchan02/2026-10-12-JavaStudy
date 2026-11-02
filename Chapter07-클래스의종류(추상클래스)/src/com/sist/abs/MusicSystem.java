package com.sist.abs;
/*
 * 	1. 데이터 수집 : 추상메소드
 * 	----------
 * 	2. 목록
 * 	3. 검색
 * 	4. 상세보기
 * 	---------- default
 * 
 * 	게시판
 * 	  글쓰기 / 목록 / 상세보기 / 검색 / 수정 / 삭제
 * 	
 * 	답변형 게시판
 * 	  글쓰기 / 목록 / 상세보기 / 검색 / 수정 / 삭제 / 답변
 * 
 * 	댓글형 게시판
 * 	  글쓰기 / 목록 / 상세보기, 댓글 / 검색 / 삭제
 * 
 *	라이브러리 : 이미 구현한 클래스를 제공
 */
public abstract class MusicSystem {
	// 상속받은 클래스까지 접근이 가능, private => getter / setter
	private static Music[] musics = new Music[50];
	// 구현
	public Music[] musicList() {
		return musics;
	}
	
	public Music musicDetail(int mno) {
		return musics[mno - 1];
	}
	
	public Music[] musicFindData(String title) {
		int count=0;
		for(Music m : musics) {
			if(m.getTitle().contains(title)) {
				count++;
			}
		}
		Music[] music = new Music[count];
		
		int i = 0;
		for(Music m : musics) {
			if(m.getTitle().contains(title)) {
				music[i] = m;
				i++;
			}
		}
		return music;
		
	}
	
	public static Music[] getMusics() {
//		System.out.println("MusicSystem:musics=> " + musics);
		return musics;
	}
	
	// 구현이 안된 메소드
	public abstract void dataCollection();

}
