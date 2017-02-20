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
		cal1.setFirstDayOfWeek(2); // �ֽ����� �����Ϸ� ����
		cal1.set(Y, startMonth, 1);
        cal1.set(Calendar.DAY_OF_WEEK, 2); // �ش� �� �߿� �����Ϸ� �����ϴ� �� ����
		System.out.println(cal1.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setFirstDayOfWeek(2);
		cal2.set(Y, endMonth, 1); //������ �� ����
		
		int maxDay = cal2.getActualMaximum(Calendar.DAY_OF_MONTH); //�ش�� ��������
		
		cal2.set(Y, endMonth, maxDay);
		
		int maxDayOfWeek = cal2.get(Calendar.DAY_OF_WEEK); //�������� ����
		int gapDayOfWeek = maxDayOfWeek - (DayOfWeek.Sunday.ordinal()+1); // �������� ���ϰ� �Ͽ����� ����	
		
		int lastSunday = maxDay - gapDayOfWeek; //�ش� ���� ������ �Ͽ��� ��¥
		
		cal2.set(Y, endMonth, lastSunday); //������ ���� ����
		
		System.out.println(cal2.getTime());
		
		int gapWeek = cal2.get(Calendar.WEEK_OF_YEAR) - cal1.get(Calendar.WEEK_OF_YEAR) +1; // ���థ���ִ� �ִ� ����
		
		
		return gapWeek;

	}

	public static void main(String[] args) {

		int answer = solution(2017, "May", "May", "Wednesday");

		System.out.println("answer : " + answer);

	}

}
