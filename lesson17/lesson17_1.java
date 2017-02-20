package lesson17;

public class lesson17_1 {

	
	public static void main(String[] args) {
		
		
		int[] A = {1, -2, 0, 9, -1, -2};
		
		int n = A.length;
        int[] dp = new int[n];
        dp[0] = A[0];
        for (int i = 1; i < n; i++) {
            int max = dp[i - 1] + A[i];
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    max = Math.max(dp[i - j] + A[i], max);
                }
            }
            dp[i] = max;
        }
        
        
        System.out.println(dp[n - 1]);
        
     
		
	}
}
