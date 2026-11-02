package com.sist.abs;

import lombok.Data;

// 사용자 정의 데이터형
@Data
public class Music {
	
	private int mno; // 음악에 대한 고유 번호
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;

}
