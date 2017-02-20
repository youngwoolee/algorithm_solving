package lesson10;

public class lesson10_1 {

	public static void main(String[] args) {

		int N = 49;
		
		int count = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			
			
			if ((N % i) == 0) {
				
				count += 2;
			}
			if (i == Math.sqrt(N)) {
				--count;
			}

		}

		System.out.println(count);
	}
}
