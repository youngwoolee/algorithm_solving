package lesson13;

public class lesson13_1 {

	
	public static void main(String[] args) {
		
		int[] A = {4, 4, 5, 5, 1};
		int[] B = {3, 2, 4, 3, 1};		
				
		int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(A[i], max);
        }
        
         max += 2;

        double[] fib = new double[max];

        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < max; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % (1 << 30);
        }

        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = (int) (fib[A[i]] % (1 << B[i]));
        }
        

        for(int i=0; i< res.length; i++) {
        	System.out.println(res[i]);
        }
		
	}
}
