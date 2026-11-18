package com.sist.io;
/*
 *     입출력 => 저장, 읽기
 *     
 *     1) 무엇을 저장할까?
 *        글자 -> FileWriter***
 *        사진 -> FileOutputStream***
 *        숫자 -> DataOutputStream
 *        객체 -> ObjectOutputStream***
 *        
 *     2) 어디에 저장할까?
 *        파일
 *        메모리
 *        네트워크 Socket
 *     
 *     3) 어떻게 읽고 쓸까?
 *        바이트 단위 -> InputStream, OutputStream : zip, jar ...
 *        문자 -> Reader, Writer : txt, dat, csv
 *        
 *     오라클 : 저장, 읽기, 수정, 삭제
 *            ----------------- 스트림을 사용하지 않는다 => JDBC
 *            => 전송 => SQL(오라클이 인식) => 값 수신 => 자바
 *            --------------------------------------------
 *            나머지 => XML, JSON => HTML => 외부 라이브러리에서 지원
 *            
 *     1) IO
 *        = 입력 (Input) => 읽기
 *          파일 -> 프로그램
 *          메모리 -> 프로그램
 *          서버 -> 프로그램
 *        = 출력 => 쓰기
 *          프로그램 -> 파일
 *          프로그램 -> 메모리
 *          프로그램 -> 서버
 *        = 데이터를 처리하는 방법
 *          1. 1byte : 사진, 동영상, PDF, jar, zip
 *             바이트 스트림
 *             ~InputStream, ~OutputStream
 *          2. 2byte : 한글제어, 텍스트 관련 (한글은 1글자 2byte)
 *             ~Reader, ~Writer
 *                |        |
 *                    데이터 보내는 역할
 *          데이터 가지고 오는 역할
 *        
 *        = 바이트 스트림
 *           데이터를 1바이트씩 읽기, 쓰기를 한다
 *           => 파일 이동 / 업로드 / 다운로드 => 이용하는 파일이 다양하다
 *           => FileOutputStream : 파일에 데이터 저장
 *              사용처 => 이미지, 바이너리 파일 저장, 바이트 데이터
 *              주요 메소드 
 *              write(int b) => 문자 한개 (정수로 변환) => 1byte
 *              write(byte[]) => 여러글자 저장
 *                   -------- 문자열.getBytes() => byte[]
 *              close() => 파일 닫기 => 종료가 되면 닫기
 *              *** new FileOutputStream("파일명")
 *                   => 기존의 파일이 있는 경우 덮어 쓴다 => w
 *                  new FileOutputStream("파일명", true)
 *                   => 기존 내용뒤에 추가가 된다 => a(append)
 *           => FileInputStream : 파일에서 데이터 읽기
 *              사용처 => 이미지, 바이너리 파일 저장, 바이트 데이터 복사
 *              주요 메소드
 *              read() : 1byte 읽기 => 끝나면 -1 리턴 (EOF)
 *                       --------- 문자 한개 (정수로 읽어 온다)
 *                       int read()
 *                       --- 문자의 번호 리턴
 *              int read(byte[], int, int) : 어디서 어디까지 => byte[]
 *              --- 실제 읽은 바이트 수
 *              int read(byte[])
 *              close() : 닫기
 *         *** read() => 바이트, 한글이 포함 => 문자 스트림을 이용한다.
 *             --------------- 파일 복사 (업로드, 다운로드)
 *             
 *         = 문자 스트림
 *           => 문자 데이터를 처리 / 텍스트와 관련된 파일 제어
 *           => FileWriter
 *              1) 메모장, 게시판, 회원 정보 => 텍스트 저장시 주로 사용
 *              2) 주요 메소드
 *                 write(String) : 문자열로 저장 (*******)
 *                 write(char[]) : 문자 .문자 배열로 저장
 *                 close()
 *           => FileReader : 문자 읽기
 *              1) 메모장 출력 / 게시판 출력
 *              2) read() => 한글자만 읽는다
 *              3) close()
 *          
 */
public class 파일_입출력_4 {
	
	public static void main(String[] args) {
		System.out.println((int)'홍');
		
	}

}
