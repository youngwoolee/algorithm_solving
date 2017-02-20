package lesson06;

import java.util.Arrays;

public class lesson06_1 {

	public static int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		Arrays.sort(A);
		int cnt = 0;

		for (int i = 1; i < A.length; i++) {

			if (A[i] != A[i - 1]) {
				cnt++;

			}

		}

		return cnt + 1;

	}

	public static void main(String[] args) {

		int[] A = { 1 };
		
		int answer = solution(A);
		
		System.out.println(answer);

	}
}
