package lesson05;

public class lesson05_1 {

	public static int solution(int A, int B, int K) {

		int halfA = 0;
		if (A > 1) {

			halfA = (A - 1) / K;
		}

		int halfB = 0;
		halfB = B / K;

		int result = Math.abs(halfB - halfA);

		// If A == 0, we add one more divisor,
		// because, by definition, 0 is divisible by any number
		if (A == 0)
			result++;

		return result;

	}

	public static void main(String[] args) {

		int A = 3;
		int B = 11;
		int K = 2;

		System.out.println((A - 1) / K);
		int answer = solution(A, B, K);

		System.out.println(answer);

	}
}
