package lesson03;

public class lesson03_2 {

	
	public static void main(String[] args) {
		
		int[] A = {2,3,1,5};
		
		int N = A.length;
		int sum = 0;
		for(int i=1; i<= A.length+1; i++) {
			sum +=i;
		}
		
		for(int i=0; i< A.length; i++) {	
			sum -= A[i];		
		}
		
		System.out.println(sum);
		
	}
	
	
}
