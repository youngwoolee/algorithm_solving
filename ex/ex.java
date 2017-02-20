package ex;

public class ex {
	public static void main(String[] args) {

		int count = 0;
		for(int i = 1; i < 10001; i++)
		{
		    for(int j = i; j > 0; j /= 10)
		    {
		        if(j % 10 == 8)
		        {
		            count++;
		        }
		    }
		}
		
		System.out.println(count);
	}
}
