package com.sist.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import lombok.Getter;

public class BookSystem {
	
	@Getter
	private static ArrayList<BookVO> bList = new ArrayList<BookVO>();
	// 모든 사용자가 공유하는 변수
	// static에 대한 초기화
	static {
		
		try {
			// 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 연결
			String url = "jdbc:oracle:thin:@xxx.xxx.xxx.xx:1521:XE";
			Connection conn = DriverManager.getConnection(url, "hr", "happy");
			// SQL 문장 전송
			String sql = "SELECT no,title,author,poster,pubdate,pages,price "
					+ "FROM book ORDER BY no ASC";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 결과값 받기
			ResultSet rs = ps.executeQuery();
			// 닫기 
			while(rs.next()) {
				
				BookVO vo = new BookVO();
				vo.setNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setAuthor(rs.getString(3));
				vo.setPoster(rs.getString(4));
				vo.setPubdate(rs.getDate(5));
				vo.setPages(rs.getString(6));
				vo.setPrice(rs.getInt(7));
				bList.add(vo);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch(Exception ex) {
			
		}
	}
	
	// 기능
	// 1. 목록 => 페이지 나눠서
	public ArrayList<BookVO> bookListData(int page) {
		
		final int ROWSIZE = 10;
		int start = (page * ROWSIZE) - ROWSIZE;
		int end = page * ROWSIZE;
//		int totalPage = (int)(Math.ceil(bList.size() / 10.0));
		if(end > bList.size()) {
			end = bList.size();
		}
		
		ArrayList<BookVO> list = new ArrayList<BookVO>(bList.subList(start, end));
		
		return list;
	}
	// 2. 상세보기
	public BookVO bookDetailData(int no) {
		
		BookVO vo = new BookVO();
		for(BookVO bvo : bList) {
			if(no == bvo.getNo()) {
				vo = bvo;
				break;
			}
		}
		return vo;
	}
	// 3. 검색
	public ArrayList<BookVO> bookFindData(String title) {
		
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		// 가변 => 데이터 갯수가 필요없다
		for(BookVO vo : bList) {
			
			if(vo.getTitle().contains(title)) {
				
				list.add(vo);
			}
		}
		return list;
	}
	// 4. 삭제
	public void bookDelete(int no) {
		
		for(int i = 0; i < bList.size(); i++) {
			
			BookVO vo = bList.get(i);
			if(no == vo.getNo()) {
				bList.remove(i);
			}
		}
	}
	

}
