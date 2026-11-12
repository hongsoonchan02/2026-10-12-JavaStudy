package com.sist.format;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *    java.text.* 패키지
 *    ----------------
 *    SimpleDateFormat : 날짜 변경
 *      => new SimpleDateFormat("yyyy-MM-dd")
 *      => 게시판, 공지사항, 댓글, 예약일, 회원가입 등록일 ...
 *    MessageFormat : 데이터베이스 / 화면 출력 => 서식
 *    ChoiceFormat : switch 대신 사용이 가능
 *    DecimalFormat : 숫자 변경 => 1,000
 *      new DecimalFormat("##,###,###")
 *      => 쇼핑몰 / 결제 / 장바구나 총액 / 예매 금액
 * 
 */
public class Format_1 {
	
	public static void main(String[] args) {
		/*
		 *   1. 년도 : yyyy / yy => 2026 / 26
		 *   2. 월  : MM / M => 09 / 9
		 *   3. 일  : dd / d => 09 / 9
		 *   4. 시간 : hh / HH => hh(12) / HH(24)
		 *   5. 분  : mm / m
		 *   6. 초  : ss / s
		 */
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yy/M/d H:m:s");
		System.out.println(sdf.format(date));
		DecimalFormat df = new DecimalFormat("###,###,###");
		int won = 100000;
		System.out.println(df.format(won) + "원");
		
		int no = 1;
		String name = "홍길동";
		String sex = "남자";
		String address = "서울";
		String phone = "010-1111-1111";
		int age = 30;
		String content = "홍길동입니다.";
		
		// 오라클에 저장
		String sql = "INSERT INTO member VALUES("
				+ no + ",'" + name + "','" + sex + "','"
				+ address + "','" + phone + "'," + age
				+ ",'" + content + "')";
		System.out.println(sql);
		
		sql = "INSERT INTO member VALUES("
				+ "{0},''{1}'',''{2}'',''{3}'',''{4}'',{5},''{6}'')";
		Object[] obj = {no, name, sex, address, phone, age, content};
		System.out.println(MessageFormat.format(sql, obj));
		
		double[] limits = {0, 60, 70, 80, 90};
		String[] formats = {
				"F", "D", "C", "B", "A"
		};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		System.out.println(cf.format(85));
		
		double num = 1234567.89;
		NumberFormat nf = NumberFormat.getInstance();
		// new를 사용하지 않는 경우 => 인터페이스 / 추상클래스
		// 미완성 클래스 => new를 사용해서 메모리 할당이 안된다
		System.out.println(nf.format(num));
		
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(num));
		
		nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(0.25));
	}
	
}
/*
 *      NumberFormat : 숫자 형식 변경 / 천단위 구분, 통화, 백분율
 *      ***DecimalFormat : 숫자 패턴 변경 / 천단위 구분
 *      ***SimpleDateFormat : 날짜 형식 변경 / 날짜 / 시간
 *      MessageFormat : 문자열 형식 변경 => 데이터값 추가가 많은 경우
 *      ChoiceFormat : 조건별 문자열 선택 => 등급 (점수별)
 *      ---------------------------------------------------
 *      전체 : TO_CHAR()    
 */
