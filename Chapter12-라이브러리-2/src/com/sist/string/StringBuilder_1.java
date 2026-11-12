package com.sist.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class StringBuilder_1 {
	
	public static void main(String[] args) {
		
		try {
			// Document doc = Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get(); 
		 	// URL url = new URL("https://www.10000recipe.com/recipe/list.html");
			// => 20버전 경고
			URI uri = URI.create("https://www.10000recipe.com/recipe/list.html");
			URL url = uri.toURL();
			
			HttpURLConnection conn =
					(HttpURLConnection)url.openConnection();
			
//			StringBuffer sb = new StringBuffer();
			StringBuilder sb = new StringBuilder();
//			String html = "";
			if(conn != null) { // 웹과 연결되었다면
				
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				long start = System.currentTimeMillis();
				
				while(true) {
					String s = br.readLine();
					if(s == null) {
						break;
					}
					sb.append(s + "\n");
//					html += s + "\n";
				}
				long end = System.currentTimeMillis();
				
//				System.out.println(html);
				System.out.println(sb.toString());
				System.out.println("걸린 시간 : " + (end - start) + "MS");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
