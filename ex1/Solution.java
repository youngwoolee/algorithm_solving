package ex1;

public class Solution {
	
	
	
	
	
	
	public void solution(int N) {

		
		
		
		
		for (int i = 1; i <= N; i++) {
			
			if(i%3 == 0) {
				System.out.print("Fizz");
			}
			if(i%5 == 0) {
				System.out.print("Buzz");
			}
			if(i%7 == 0) {
				System.out.print("Woof");
			}
			
			if( (i%3 !=0) && (i%5 !=0) && (i%7 !=0) ){
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("sample string");
		System.out.println("whole line");
	};

}
