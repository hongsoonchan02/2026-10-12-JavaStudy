package com.sist.list;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ArrayList_3 {
	
	public ArrayList<String> genieData() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			for(int i = 0; i < title.size(); i++) {
				
				list.add(title.get(i).text());
			}
		} catch(Exception ex) {
			
		}
		return list;
	}
	
	public ArrayList<String> melonData() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("tr#lst50 div.rank01 a");
			for(int i = 0; i < title.size(); i++) {
				
				list.add(title.get(i).text());
			}
		} catch(Exception e) {
			
		}
		return list;
	}
	// Collections
	/*
	 *   sort()
	 *   => removeAll() : 없는 데이터
	 *   => retainAll() : 교집합
	 *   => containsAll() : UNION 중복 X
	 *   => addAll() : UNION ALL 중복 O  
	 *   -------------------------------
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== 지니뮤직 출력 ====== ");
		ArrayList_3 a = new ArrayList_3();
		ArrayList<String> genie = a.genieData();
		for(int i = 0; i < genie.size(); i++) {
			
			System.out.println((i + 1) + "." + genie.get(i));
		}
		
		System.out.println("====== 멜론뮤직 출력 =======");
		ArrayList<String> melon = a.melonData();
		for(int i = 0; i < melon.size(); i++) {
			
			System.out.println((i + 1) + "." + melon.get(i));
		}
		
		// 지니뮤직에만 있는 노래
		System.out.println("====== 지니뮤직에만 있는 노래 ======");
		genie.removeAll(melon); // minus 차집합
		for(int i = 0; i < genie.size(); i++) {
			
			System.out.println((i + 1) + "." + genie.get(i));
		}
		
		genie = a .genieData();
		System.out.println("====== 멜론에만 있는 노래 ======");
		melon.removeAll(genie);
		for(int i = 0; i < melon.size(); i++) {
			
			System.out.println((i + 1) + "." + melon.get(i));
		}
		
		//  복구
		melon = a.melonData();
		// 곡통으로 가지고 있는 곡
		System.out.println("===== 공통으로 가지고 있는 곡 (교집합) ======");
		genie.retainAll(melon);
		for(int i = 0; i < genie.size(); i++) {
			
			System.out.println((i + 1) + "." + genie.get(i));
		}
		
		genie = a.genieData();
		// 지니뮤직 + 멜론
		System.out.println("============= 멜론 + 지니뮤직 =============");
		genie.addAll(melon);
		for(int i = 0; i < genie.size(); i++) {
			
			System.out.println((i + 1) + "." + genie.get(i));
		}
		
		System.out.println("============= 멜론 + 지니뮤직 =============");
		genie = a.genieData();
		genie.containsAll(melon);
		for(int i = 0; i < genie.size(); i++) {
			
			System.out.println((i + 1) + "." + genie.get(i));
		}
		// 게시글 + 댓글 => 맛집 + 댓글
		
	}

}
