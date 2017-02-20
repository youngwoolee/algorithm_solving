package lesson02;

public class lesson02_2 {

	public static void main(String[] args) {
		int A[] = {3, 8, 9, 7, 6};
		int K =1;
		
		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			result[(i + K) % A.length] = A[i];
		}

		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
