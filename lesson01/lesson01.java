package lesson01;

import java.util.Scanner;

public class lesson01 {

	public static int solution(int N) {
		// 가장 긴 바이너리 갭을 리턴

		int tmp =0, max =0, lng;
        char flag;
        String binary = Integer.toBinaryString(N);

        for(int i=0; i<binary.length(); i++) {

            flag = binary.charAt(i);
            if(flag == '1') {
                lng = i-tmp-1;
                if(lng>max) max=lng;
                tmp = i;

            }


        }


        return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("input N : ");
		int N = sc.nextInt();

		int max = solution(N);

		System.out.println("max : " + max);
	}

}
