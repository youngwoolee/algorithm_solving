package lesson07;

import java.util.Stack;

public class lesson07_3 {

	public static void main(String[] args) {

		int[] A = { 4, 3, 2, 1, 5 };
		int[] B = { 0, 1, 0, 0, 0 };

		Stack<Integer> sa = new Stack<Integer>();
		int live = 0;
		for (int i = 0; i < A.length; i++) {
			if (B[i] == 1) {
				sa.push(A[i]);
			} else {
				while (!sa.isEmpty()) {
					int pa = (int) sa.peek();
					if (pa < A[i]) {
						sa.pop();
					} else {
						break;
					}
				}
				if (sa.isEmpty()) {
					live++;
				}
			}
		}
		System.out.println(live + sa.size());
	}
}
