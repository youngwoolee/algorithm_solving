package lesson02;

import java.util.Arrays;

public class lesson02_1 {

	
	public static void main(String[] args) {

		int[] A = { 9, 3, 9, 3, 9, 7, 9};
		
		Arrays.sort(A);
		int res=0;
		
		for(int i=0; i< A.length; i++) {
			
		
			res = res^A[i];
			System.out.println(res);
			
		}
		

		
	}
	
	
	

}
