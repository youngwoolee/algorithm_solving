package ex5;

import java.util.ArrayList;



public class ex5 {
	
	public static void getPrime(int num) {
		
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		int[] prime1 = new int[num+1];
		
		
		
		for(int i=2; i<=num; i++) {
			prime1[i] =i;
		}
		
		
		
		for(int i=2; i<=num; i++) {
			if(prime1[i] == 0) {
				continue;
			}
			for(int j =i+i; j<= num; j+=i) {
				prime1[j] = 0;
			}
		}
		
		for(int i=2; i<=num; i++) {
			if(prime1[i] != 0) {
				System.out.println(prime1[i]);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		long start = System.currentTimeMillis();
		getPrime(50000);
		long end = System.currentTimeMillis();

		System.out.println("수행 시간 : " + (double) (end-start)/1000);
		
	}

}
