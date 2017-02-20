package test04;



public class test04 {

	static long cnt = 0;
	static int cache[] = new int[10];
	
	public static int solution(int N) {

		
		return count_1s(N);
	}
	
	public static int count_1s(int N) {
		cnt++;
		
		if (N ==0) return 0;
		if(N < 10) return 1;
		
		int result =0;
		
		int key = is_pow_10(N+1);
		
		boolean cacheable = (key != -1);
		
		int ret = cache[key];
		if(cacheable && ret !=-1) {
			return ret;
		}
		
		int d=1;
		while(d*10 <= N) {
			d*=10;
		}
		
		int q = N /d;
		int r = N %d;
		
		if(q>1) result +=d;
		if(q==1) result += r+1;
		
		result += q * count_1s(d-1);
		result += count_1s(r);
		
		if(cacheable)
			return ret = result;
		else 
			return result;
	}
	
	public static int is_pow_10(int N) {
		int key=0;
		while(N %10 ==0) {
			N/=10; key++;
		}
		if(N!=1)
			return -1;
		else
			return key;
	}

	public static void main(String[] args) {

		int N =100000;
		long start = System.currentTimeMillis();
		
		int answer = solution(N);

		long end = System.currentTimeMillis();
		
		
		System.out.println("answer : " + answer);
		
		System.out.println((end - start) / (double) 1000);
	}

}
