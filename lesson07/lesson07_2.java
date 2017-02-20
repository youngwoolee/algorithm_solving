package lesson07;

import java.util.Stack;

public class lesson07_2 {

	public static void main(String[] args) {

		int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};	
		
		
		int cuts = 0;
        Stack st = new Stack();

        for (int h : H) {
            while (!st.isEmpty() && ((int) st.peek()) > h) {
                st.pop();
            }
            if (st.isEmpty() || ((int) st.peek()) < h) {
                st.push(h);
                cuts++;
            }
        }
        
        System.out.println(cuts);
	}
}
