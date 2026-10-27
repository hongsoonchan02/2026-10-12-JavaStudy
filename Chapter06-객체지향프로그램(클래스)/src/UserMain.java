class Card {
	int no;
	String type; // 객체.type 가능 
	static int width; // 객체.width, 클래스.width 가능
	static int height;
}
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card a = new Card();
		a.no = 2;
		a.type = "♣";
		a.width = 200;
		a.height = 300;
		Card b = new Card();
		b.no = 3;
		b.type = "♠";
		b.width = 250;
		b.height = 350;
		Card c = new Card();
		c.no = 4;
		c.type = "◆";
		c.width = 500;
		c.height = 700;
		
		System.out.println(a.width);
		System.out.println(a.height);
		System.out.println(a.type);
	}

}
