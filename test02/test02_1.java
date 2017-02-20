package test02;

import java.util.Calendar;

import test02.test02.DayOfWeek;
import test02.test02.Month;

public class test02_1 {
	
	public enum Month {
		January, Febuary, March, April, May, June, July, August, September, October, November, December
	}
	public enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}

	public static int solution(int Y, String A, String B, String W) {

		int startMonth = Month.valueOf(A).ordinal();
		int endMonth = Month.valueOf(B).ordinal();
		int dayOfWeek = DayOfWeek.valueOf(W).ordinal()+1;
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setFirstDayOfWeek(2); // 주시작을 월요일로 세팅
		cal1.set(Y, startMonth, 1);
        cal1.set(Calendar.DAY_OF_WEEK, 2); // 해당 월 중에 월요일로 시작하는 날 세팅
		System.out.println(cal1.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setFirstDayOfWeek(2);
		cal2.set(Y, endMonth, 1); //마지막 월 세팅
		
		int maxDay = cal2.getActualMaximum(Calendar.DAY_OF_MONTH); //해당월 마지막날
		
		cal2.set(Y, endMonth, maxDay);
		
		int maxDayOfWeek = cal2.get(Calendar.DAY_OF_WEEK); //마지막날 요일
		int gapDayOfWeek = maxDayOfWeek - (DayOfWeek.Sunday.ordinal()+1); // 마지막날 요일과 일요일의 차이	
		
		int lastSunday = maxDay - gapDayOfWeek; //해당 월의 마지막 일요일 날짜
		
		cal2.set(Y, endMonth, lastSunday); //마지막 날로 세팅
		
		System.out.println(cal2.getTime());
		
		int gapWeek = cal2.get(Calendar.WEEK_OF_YEAR) - cal1.get(Calendar.WEEK_OF_YEAR) +1; // 여행갈수있는 최대 주차
		
		
		return gapWeek;

	}

	public static void main(String[] args) {

		int answer = solution(2017, "May", "May", "Wednesday");

		System.out.println("answer : " + answer);

	}

}
