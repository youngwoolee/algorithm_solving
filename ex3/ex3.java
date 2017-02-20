package ex3;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex3 {

	static int solution(String s) {

		Stack<Character> stack = new Stack<Character>();
		int openBracketCount = 0; // 처음 시작하는 '(' 개수
		int closeBracketCount = 0; // ')' 개수
		int K = 0;

		// 처음 시작하는 '(' 개수와 ')' 개수를 구한다
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				if (i > openBracketCount) {
					break;
				}
				openBracketCount++;
			} else if (s.charAt(i) == ')') {
				closeBracketCount++;
			}
		}

//		// '(' 개수가 ')' 개수 보다 많으면 0을 반환
//		if (openBracketCount > closeBracketCount) {
//			System.out.println("error");
//			return 0;
//		}

		// 끝에서부터 ')' 개수가 '('의 개수만큼 나올때까지 계산해준다
		for (int i = s.length() - 1; i >= 0; i--) {

			if (openBracketCount != 0 && s.charAt(i) == ')') {

				openBracketCount--;
				K = i;
			}

		}

		return K;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("input String : ");

		String s = sc.next();

		int K = solution(s);

		System.out.println("K : " + K);

	}

}
