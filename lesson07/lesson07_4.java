package lesson07;

public class lesson07_4 {
	public static void main(String[] args) {
		int res = 0;
		int ret =0;
		String S = ")(()";
        char[] ch = S.toCharArray();
        for (char c : ch) {
            if (c == '(') {
                res++;
            } else {
                if (--res < 0) {
                    break;
                }
            }
        }
        if (res == 0) {
        	ret = 1;
        }
        else{
        	ret = 0;
        }
        
        System.out.println(ret);
	}
}
