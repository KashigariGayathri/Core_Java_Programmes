package enumdatatypeexamples;

import enumdatatypeexamples.EnumExample2.Day;

public enum EnumDayEx {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), 
	SATURDAY(6);
	private int dayIndex; 
	EnumDayEx(int name){
	this.dayIndex = name;
	}
	public static void main(String[] args) { 
	System.out.println(Day.MONDAY.getDayIndex());
	System.out.println(Day.TUESDAY);
	}
	public int getDayIndex() {
	return dayIndex;
	}
}
