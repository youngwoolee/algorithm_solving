package lesson04;

import java.util.HashSet;

public class lesson04_2 {

	public static int solution(int X,  int[] A, int N) {
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		
		for(int i=0; i<N;i++) {
			hash.add(A[i]);
			if(hash.size() == X) {
				return i;
			}
			
		}
		
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
	
		int[] A = {1,3,1,4,2,3,5,4};
		
		int N = A.length;
		int X = 5;
		
		int answer = solution(X, A, N);
		
		System.out.println(answer);
		
	}
}
