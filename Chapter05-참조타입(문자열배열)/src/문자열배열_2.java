/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트

 * 
 */




import java.io.FileReader;
import java.util.Scanner;

public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 읽기
	try {	
		FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
		int i = 0; // 문자 한개 읽을 때 사용
		// String movies = "";
		StringBuffer sb = new StringBuffer();
		while((i = fr.read()) != -1) { // -1 파일의 끝 => EOF
			sb.append((char)i);
		}
		fr.close();
//		System.out.println(sb.toString());
		String[] movies = sb.toString().split("\n");
		String[] rank = new String[1938];
		String[] title = new String[1938];
		String[] genre = new String[1938];
		String[] actor = new String[1938];
		String[] grade = new String[1938];
		String[] director = new String[1938];
		
		i = 0;
		for(String movie : movies) {
//			System.out.println(movie);
			String[] total = movie.split("\\|");
			rank[i] = total[0];
			title[i] = total[1];
			genre[i] = total[2];
			actor[i] = total[4];
			grade[i] = total[6];
			director[i] = total[7];
			i++;
		}
		// 영화 데이터 초기화
//		for(int j=0; j<10; j++) {
//			System.out.println(rank[j] + "." +
//		title[j]);
//		}
//		System.out.println("====== 관람가 ======");
//		Scanner scan = new Scanner(System.in);
//		System.out.print("등급 선택 : ");
//		String g = scan.next();
//		for(int j=0; j<grade.length; j++) {
//			if(grade[j].contains(g)) {
//				System.out.println(title[j] + " " + grade[j]);
//			} 
//		}
		
//		System.out.println("====== 출연진을 입력 => 영화 제목 ======");
//		Scanner scan = new Scanner(System.in);
//		System.out.print("출연진을 입력해주세요 : ");
//		String a = scan.next();
//		for(int j=0; j<actor.length; j++) {
//			if(actor[j].contains(a)) {
//				System.out.println(title[j] + " " + actor[j]);
//			}
//		}
		/*System.out.println("====== 영화 제목 검색 ======");
		Scanner scan = new Scanner(System.in);
		System.out.print("영화명 입력 : ");
		String name = scan.next();
		for(String n : title) {
			if(n.contains(name)) {
				System.out.println(n);
			}
		}*/
		/*
		 * 	데이터를 나눠서 저장 ===> 배열이 여러개
		 * 		=> 인덱스 => 일반 for
		 * 	데이터를 통으로 저장 ===> 배열은 1개
		 * 		=> 문자열 => for-each
		 * 
		 * 	=> contains / equals
		 * 	=> 배열에 저장 => split
		 * 	=> 문자열 : 검색
		 * 	=> 크롤링
		 * 	=> 목록 / 상세보기 => 메소드
		 */
//		Scanner scan = new Scanner(System.in);
//		int totalpage = (int)(Math.ceil(title.length/10.0));
//		// 총페이지 구하기 : ceil => 올림함수
//		// 1938/10 => 193.8 => 194
//		System.out.print("페이지 입력(1~" + totalpage + ") : ");
//		int page = scan.nextInt();
//		i = 0; // 10만 출력
//		int pageCnt = (page*10) - 10; // 출력 시작 위치
		/*
		 *  1page => 0 ~ 9
		 *  2page => 10 ~ 19
		 *  3page => 20 ~ 29
		 * 
		 */
//		for(int j=0; j<title.length; j++) {
//			if(i<10 && j>=pageCnt) {
//				System.out.println(rank[j] + "." + title[j]);
//				i++;
//			}
//		}
		Scanner scan = new Scanner(System.in);
		System.out.print("주인공 이름을 입력 : ");
	    String ac = scan.next();
	    // => 문자열 받는 경우
	    System.out.println("===== " + ac + "님의 출연작 =====");
	    int count = 0;
	    for(int j=0; j<actor.length; j++) {
	    	if(actor[j].contains(ac)) {
	    		System.out.println(title[j] + " / " + actor[j]);
	    		count++;
	    	}
	    }
	    System.out.println("총 출연작은 " + count + "편입니다.");
	    
	} catch(Exception ex) {
		ex.printStackTrace();
	}

	}

}
