package com.sist.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

// 웹 => 가장 많이 사용되는 입출력 => BufferedReader
// https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do
/*
 *   => BufferedReader => new FileInputStream() (FileReader X)
 *      BufferedWriter => new FileOutputStream() 연결 (FileWriter X)
 */
public class Buffered_3 {
	
	public static void main(String[] args) {
		
		try {
			URI uri = new URI("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do");
			URL url = uri.toURL();
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			// 웹 연결
			if(conn != null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				while(true) {
					String json = br.readLine();
					if(json == null) {
						break;
					}
					System.out.println(json + "\n");
				}
				br.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
