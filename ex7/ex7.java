package ex7;

import java.util.Scanner;

public class ex7 {

	static int solution(String s) {

		int V = Integer.parseInt(s, 2);
		int step = 0;

		while (V != 0) {

			if (V % 2 == 0) {
				V = V / 2;
			} else {
				V = V - 1;
			}

			step++;
		}

		return step;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("input binary : ");
		String s = sc.next();

		int step = solution(s);

		System.out.println("step : " + step);

	}
}
