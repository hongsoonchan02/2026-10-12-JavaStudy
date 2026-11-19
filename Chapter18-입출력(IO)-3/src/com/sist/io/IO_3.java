package com.sist.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 파일을 읽어서 => 복사 : BufferedInputStream / BufferedOutputStream
// 웹에서 한번 사용 => 다운로드
public class IO_3 {
	
	public static void main(String[] args) {
		
		try {
			
			// 파일에서 1024씩 읽어서 처리
			FileInputStream fis = new FileInputStream("c:\\javaDev\\shoes.csv");
			
			FileOutputStream fos = new FileOutputStream("c:\\java_data\\shoes.csv");
			
			// 데이터를 모아서 처리
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] buffer = new byte[1024];
			int i = 0; // 읽은 바이트 수
			
			while((i = bis.read(buffer, 0, 1024)) != -1) {
				
				bos.write(buffer, 0, 1);
			}
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료(다운로드)");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
