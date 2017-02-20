package test02;

public class test02 {

	enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static int solution(int year, String A, String B, String W) {
		
		
		int a = Month.valueOf(A.toUpperCase()).ordinal(); //��߿�
		int b = Month.valueOf(B.toUpperCase()).ordinal(); //���Ϳ�
		int w = Day.valueOf(W.toUpperCase()).ordinal(); //1��1�� ��¥�� ����

		if(a<=b) {
			//���Ϳ��� ��� ������ ���� �� �� ����
		
			int eDay[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				//���� ���
				eDay[1] = 29;
			}
	
	
			int firstDayOfWeek = 0; //������ ����
			int endDayOfWeek = 0; // ������ ����
			int startAccumulatedDay = 0; //��� �� ������ ���� ��¥
			int endAccumulatedDay = 0; // ���� �������� ���� ��¥
			int weekCount = 0; //���� ��� 
	
			for (int i = 0; i < a; i++) {
				startAccumulatedDay = startAccumulatedDay + eDay[i];
			}
	
			firstDayOfWeek = (startAccumulatedDay + w) % 7 ;
			
	
	
			for (int i = 0; i <= b; i++) {
				endAccumulatedDay = endAccumulatedDay + eDay[i];
			}
			
	
			endDayOfWeek = (endAccumulatedDay + w - 1) % 7;
			
	
			
			if (firstDayOfWeek == 0) {
				weekCount = (endAccumulatedDay - startAccumulatedDay - (endDayOfWeek + 1) % 7 ) / 7;
			} else {
				weekCount = (endAccumulatedDay - startAccumulatedDay - (7 - firstDayOfWeek) % 7 ) / 7;
			}
			
			return weekCount;
		}
		
		else 
			return 0;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(solution(2015, "Jan", "February", "Thursday"));
		
	}

}
