package com.sist.inter2;
// 동일하게 적용 => default
// => 새로운 기능 추가시에
// 동일하지 않는 경우 => 선언 => 프로그램을 따로 구현
public interface Board {
	
	public void write();
	
	public void list();
	
	public void detail();
	
	public void update();
	
	public void delete(); // 댓글, 자료실
	// 댓글 삭제 => 게시물 ==> 파일 삭제, 게시물 삭제
	
	public default void paging() {
		// 모든 게시판 종류가 동일한 경우 => 구현
	}

}
