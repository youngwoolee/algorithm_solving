package ex3;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex3 {

	static int solution(String s) {

		Stack<Character> stack = new Stack<Character>();
		int openBracketCount = 0; // ó�� �����ϴ� '(' ����
		int closeBracketCount = 0; // ')' ����
		int K = 0;

		// ó�� �����ϴ� '(' ������ ')' ������ ���Ѵ�
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

//		// '(' ������ ')' ���� ���� ������ 0�� ��ȯ
//		if (openBracketCount > closeBracketCount) {
//			System.out.println("error");
//			return 0;
//		}

		// ���������� ')' ������ '('�� ������ŭ ���ö����� ������ش�
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
