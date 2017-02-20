package lesson09;

import java.util.Arrays;

public class lesson09_3 {

	
	public static void main(String[] args) {
		
		int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
		
		if (A.length ==0) {
			
		}
		
		int profit =0;
		int buy=0;
		int sell=0;
		buy =A[0];
		
		for(int i=1; i<A.length; i++) {
			if(A[i] -buy > profit) {
				sell = A[i];
				profit = sell -buy;
			}
			else if(A[i]<buy) {
				buy =A[i];
			}
		}
		
		System.out.println(profit);
		
		
		
		
	}
}
