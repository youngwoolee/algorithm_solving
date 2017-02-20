package ex4;

import java.util.Scanner;
import java.util.Vector;

public class ex4 {

	public static final int MAX = 100001;

	static int solution(Vector<Integer> arr) {

		int ret = 0;
		int[] cache = new int[MAX];


		int offset = 0;
		int countDay = 0;
		
		for (int today = 1; today <= arr.lastElement(); today++) {

			if (arr.get(offset) == today) {
				// 여행 하는 날 일때
				cache[today] = cache[today - 1] + 2;
				countDay++;
				
				if (countDay >= 4) {
					cache[today] = Math.min(cache[today], cache[today+1 - 7] + 7);
					countDay=0;
				}
				if (countDay >= 13) {
					cache[today] = Math.min(cache[today], cache[today+1 - 30] + 25);
					countDay = 0;
				}

				
				offset += 1;

			}

			else {
				// 여행 하는 날이 아닐때
				cache[today] = cache[today - 1];
			}

		}
		
		ret = cache[arr.lastElement()];
		return ret;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("input N : ");
		int consistDay = sc.nextInt(); // 고려중인 일수

		Vector<Integer> arr = new Vector<Integer>(consistDay);

		for (int i = 0; i < consistDay; i++) {

			arr.addElement(sc.nextInt());
		}

		int ret = solution(arr);

		System.out.println("ret : " + ret);
	}
}
