package com.sist.music;

import lombok.Data;

// 캡슐화
// 변수 (메모리에 저장 / 메모리 읽기) => 원본은 감추고 메소드를 통해서 제어
//       setter		getter
@Data
public class MusicVO {

	private int rank;
	private String poster;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
}
