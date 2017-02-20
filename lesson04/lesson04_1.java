package lesson04;


import java.util.HashSet;

public class lesson04_1 {

	public static int solution(int A[]) {

		int result =1;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<A.length; i++) {
			set.add(A[i]);
		}
		
		System.out.println(set);
		
		while(set.contains(result)) {
			result++;
			
		}
		return result;
	}

	public static void main(String[] args) {

		int[] A = { 1,3,6,4,1,2 };

		int answer = solution(A);
		
		System.out.println(answer);

	}
}
