import java.util.Arrays;

public class 단항연산자_증감연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			
			if(arr[i] == 5)
				count++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);

	}

}
