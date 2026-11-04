package com.sist.exception;

import java.io.FileReader;

public class 예외처리_자원자동화처리 {
	
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("")) {
			
			int i = 0;
			while((i=fr.read()) != -1) {
				
				System.out.println((char)i);
				
			}
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
	}

}
