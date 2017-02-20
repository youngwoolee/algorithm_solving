package test03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

import ex.ex;

public class test03 {

	Tree T;
	static int max = 0;
	static int index = 0;
	static int count = 0;
//	static HashSet<Integer> set = new HashSet<Integer>();
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static int search(Tree T) {

		if (T == null) {
			max = Math.max(map.size(), max);
			return max;
		}

//		if (!map.containsValue(T.x)) {
//			count++;
//
//		}
		if(!map.containsKey(T.x))
			map.put(T.x, 1);
		else {
			map.replace(T.x, map.get(T.x)+1);
		}
		
		search(T.l);
		search(T.r);

		if(map.containsKey(T.x))
		{
			map.replace(T.x, map.get(T.x)-1);
			if(map.get(T.x) == 0)
				map.remove(T.x);
		}
		// 되돌아가기
//		if (index >0 && map.get(index) == T.x) {
//
//			map.remove(index);
//			index--;
//		}
		

		return max;
	}

	public static int solution(Tree T) {

		int result = search(T);

		return result;
	}

	public static void main(String[] args) {

		Tree A = new Tree(4);
		Tree B = new Tree(5);
		Tree D = new Tree(4);
		Tree G = new Tree(5);
		Tree C = new Tree(6);
		Tree E = new Tree(1);
		Tree F = new Tree(6);

		A.l = B;
		A.r = C;
		B.l = D;
		D.l = G;
		C.l = E;
		C.r = F;
		F.r = new Tree(7);
		F.r.r = new Tree(10);

		int answer = solution(A);

		System.out.println("answer : " + answer);
	}

}
