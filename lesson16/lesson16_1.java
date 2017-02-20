package lesson16;

public class lesson16_1 {

	
	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,1,3,1,2,1};		
		int K =4;
		
		int sum = 0;
        int ropes = 0;
        
        
        for (int element : A) {
            sum += element;
            if (sum >= K) {
                sum = 0;
                ropes++;
            }
        }

        System.out.println(ropes);
		
	}
}
