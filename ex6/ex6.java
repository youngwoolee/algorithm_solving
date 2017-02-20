package ex6;

import java.util.Scanner;

public class ex6 {

	public static int solution(int[] A) {

		int dividerPos = 0;
		int max = 0;
		int[] pre = new int[A.length];
		int[] post = new int[A.length];

		pre[0] = A[0];
		post[A.length - 1] = A[A.length - 1];

		// pre 값 세팅
		for (int i = 1; i < A.length; i++) {

			if (pre[i - 1] > A[i]) {
				pre[i] = pre[i - 1];
			} else {
				pre[i] = A[i];
			}

		}

		// post 값 세팅

		for (int i = A.length - 1; i > 0; i--) {

			if (post[i] > A[i - 1]) {
				post[i - 1] = post[i];
			} else {
				post[i - 1] = A[i - 1];
			}

		}

		for (int i = 0; i < A.length - 1; i++) {

			int temp = Math.abs(pre[i] - post[i + 1]);

			if (max < temp) {
				max = temp;
				dividerPos = i;
			}

		}

		return dividerPos;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input N (2 ~ 100000) : ");
		int N = sc.nextInt();
		int[] A = new int[N];

		System.out.println("input number " + N + " times");
		for (int i = 0; i < N; i++) {

			A[i] = sc.nextInt();
		}

		int K = solution(A);

		System.out.println("K : " + K);

	}
}
