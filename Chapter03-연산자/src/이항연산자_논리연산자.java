
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;
public class 이항연산자_논리연산자 {
	
	public static void main(String[] args) throws Exception {
		
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("table.list-wrap a.title");
		Elements singer = doc.select("table.list-wrap a.artist");
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력 : ");
		String ss = scan.next();
		for(int i = 0; i < title.size(); i++) {
			
			if(title.get(i).text().contains(ss))
				System.out.println((i + 1) + "." + title.get(i).text());
		}
		
	}

}
