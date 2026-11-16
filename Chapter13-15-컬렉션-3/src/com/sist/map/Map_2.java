package com.sist.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("boardList", "SELECT * FROM board");
		map.put("boardDetail", "SELECT * FROM board WHERE no=1");
		map.put("boardInsert", "INSERT INTO board VALUES(?, ? ,? ,? ,?)");
		map.put("boardUpdate", "UPDATE board SET name=''");
		map.put("boardDelete", "DELETE FROM board WHERE no=1");
		// MyBatis => XML
		Set<String> set = map.keySet();
		
		for(String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
