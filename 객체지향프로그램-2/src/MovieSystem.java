import java.io.FileReader;

public class MovieSystem {
	
	private static Movie[] movies = new Movie[1938]; // 목록, 접속자 ...
	// 초기화
	/*
	 * 	1. 예외 복구 try~catch
	 * 	2. 예외 회피 throws => 메소드 뒤에 붙어야함
	 * 	3. 예외 발생 throw
	 */
	static {
		// static 변수 초기화
		// instance => 생성자
		// {} / static{} => 자동 처리 (호출없이 사용)
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb = new StringBuffer();
			// 문자열 => 임시 저장에 한번에 모아서 처리
			// + => 문자열 결합시마다 메모리 변경
			int i = 0; // 한글자
			while ((i=fr.read()) !=-1) { // -1 EOF
				
				sb.append((char)i);
			}
			fr.close();
//			System.out.println(sb.toString());
			// 저장된 모든 데이터를 출력
			String[] movie = sb.toString().split("\n");
			//1517|셜록 홈즈|액션, 모험, 범죄, 드라마, 미스터리, 스릴러|https://movie-phinf.pstatic.net/20111223_197/1324596856883MuySp_JPEG/movie_image.jpg?type=m77_110_2|로버트 다우니 주니어(셜록 홈즈), 주드 로(왓슨 박사), 레이첼 맥아덤즈(아이린 애들러)|2009 .12.23 개봉|12세 관람가|가이 리치
			i = 0; // 배열의 인덱스
			for(String m : movie) {
				String[] info = m.split("\\|");
				movies[i] = new Movie();
				movies[i].setMno(Integer.parseInt(info[0]));
				movies[i].setTitle(info[1]);
				movies[i].setGenre(info[2]);
				movies[i].setActor(info[4]);
				movies[i].setRegdate(info[5]);
				movies[i].setGrade(info[6]);
				movies[i].setDirector(info[7]);
				i++;
			}
		} catch (Exception ex){
			// 예외 복구
			//System.out.println(ex.getMessage()); // 에러 메세지 출력
			ex.printStackTrace();
		}
	}// 데이터 수집
	// 기능
	// 1. 목록 출력
	public Movie[] movieListData() {
		return movies;
	}
	// 2. 상세보기
	public Movie movieDetailData(int mno) {
		return movies[mno-1];
	}
	// 3. 검색
	public Movie[] movieFindData(String fd) {
		int count = 0;
		for(Movie m : movies) {
			if(m.getTitle().contains(fd)) {
				count++;
			}
		}
		Movie[] m = new Movie[count];
		
		int i = 0;
		for(Movie mm : movies) {
			if(mm.getTitle().contains(fd)) {
				m[i] = mm;
				i++;
			}
		}
		return m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
