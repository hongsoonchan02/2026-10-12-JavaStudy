package com.sist.music;

// 상속을 내리는 클래스
public class Music {

	public static MusicVO[] musics = new MusicVO[50];
	
	// 기능
	// 1. 목록
	public MusicVO[] musicListData() {
		return musics;
	}
	// 2. 검색
	public MusicVO[] musicSearchTitle(String title) {
		int count = 0;
		for(MusicVO vo : musics) {
			if(vo.getTitle().contains(title)) {
				count++;
			}
		}
		MusicVO[] music = new MusicVO[count];
		int i = 0;
		for(MusicVO vo : musics) {
			if(vo.getTitle().contains(title)) {
				music[i] = vo;
				i++;
			}
		}
		return music;
	}
	
	public MusicVO[] musicSearchSinger(String singer) {
		int count = 0;
		for(MusicVO vo : musics) {
			if(vo.getSinger().contains(singer)) {
				count++;
			}
		}
		MusicVO[] music = new MusicVO[count];
		int i = 0;
		for(MusicVO vo : musics) {
			if(vo.getSinger().contains(singer)) {
				music[i] = vo;
				i++;
			}
		}
		return music;
	}
}
