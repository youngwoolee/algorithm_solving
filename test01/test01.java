package test01;

public class test01 {

	public static int solution(int[] A) {

		if(A.length == 0 || A.length == 1) {
            return 0;
        }
        
        int numHeads = 0; //head ÀÇ °³¼ö


		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				numHeads++;
			}

		}

		return (numHeads <= A.length / 2) ? numHeads : A.length - numHeads;
	}

	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 1, 1, 0 };

		int answer = solution(A);

		System.out.println("answer : " + answer);

	}

}
