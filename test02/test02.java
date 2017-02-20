package test02;

public class test02 {

	enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static int solution(int year, String A, String B, String W) {
		
		
		int a = Month.valueOf(A.toUpperCase()).ordinal(); //출발월
		int b = Month.valueOf(B.toUpperCase()).ordinal(); //복귀월
		int w = Day.valueOf(W.toUpperCase()).ordinal(); //1월1일 날짜의 요일

		if(a<=b) {
			//복귀월은 출발 월보다 선행 될 수 없음
		
			int eDay[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				//윤년 계산
				eDay[1] = 29;
			}
	
	
			int firstDayOfWeek = 0; //시작일 요일
			int endDayOfWeek = 0; // 마지막 요일
			int startAccumulatedDay = 0; //출발 월 까지의 누적 날짜
			int endAccumulatedDay = 0; // 복귀 월까지의 누적 날짜
			int weekCount = 0; //주차 계산 
	
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
