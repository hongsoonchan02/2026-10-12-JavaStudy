/*
 * 		= 일반 대입
 * 		+= 	
 * 			복합 대입연산자 => 문자열 결합, 누적
 * 			int a =10;
 * 			a += 1; ====> a = a + 1;  => a++ ++a
 * 							   ------
 * 							   10 + 1 ==> a = 11
 * 		-=
 * 		------------------------
 * 		*=
 * 		/=
 * 		%=
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println(a);
		
		a = 10;
		a += 5;
		System.out.println(a);
		
		System.out.println("===== 문자열 결합 =====");
		String s1 = "ABC";
		String s2 = "DEF";
		String s3 = "";
		s3 += s1;
		s3 += s2;
		System.out.println(s3);
		
		System.out.println("===== -= =====");
		int b = 10;
		b -= 5; // b = b - 5;
		System.out.println(b);
		
		System.out.println("===== *= ======");
		int c = 10;
		c *= 100;
		System.out.println(c);
		
		System.out.println("===== /= =====");
		double d = 10;
		d /= 3; // d = d / 3
		System.out.println(d);
		
		System.out.println("===== %= =====");
		int e = 10;
		e %= 3;
		System.out.println(e);
		
	}

}
