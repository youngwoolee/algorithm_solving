package ex2;

import java.util.Arrays;

public class ex2 {

	public static int solution(int[] A) {
		
		if(A.length == 1 || A.length == 0) {
			return 0;
		}
		
		Arrays.sort(A);
		
		
		int begin = 0;
		int end = A.length - 1;
		int gap = A[end] - A[begin];

		while (gap > 1) {

			if (A[end - 1] - A[begin] <= A[end] - A[begin + 1]) {
				System.out.println("end : " + end + " begin : " + begin);
				gap = A[end - 1] - A[begin];
				if(end-1 == begin) {
					return 0;
				}
				end--;

			} else if(A[end - 1] - A[begin] > A[end] - A[begin + 1]){

				gap = A[end] - A[begin + 1];
				begin++;
			}
			
			else {
				
				return 0;
			}

		}

		
		return end - begin + 1;
	}
	
	public static void main(String[] args) {

		int[] A = {1,4,5,6,6,7,7,8};
		
		int answer = solution(A);
		
		System.out.println(answer);

		
		

		// //Ãâ·Â
		// for (int i = 0; i < A.length; i++) {
		// System.out.println(A[i]);
		// }

	}

}
