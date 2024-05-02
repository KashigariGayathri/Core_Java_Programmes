package enumdatatypeexamples;

public class EnumExample1 {
	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
		FRIDAY, SATURDAY, SUNDAY
		}
	/*Enum is a one of the special data types to declare the list of constants that enable for a variable, which have 
similar meaning. For example, we create enum to manage the list of months, name of days, and other similar 
kind of values */
	/* Here, we have declared a enum Day, which holds name of the days and printed the first constant MONDAY as 
	follows*/
			
			public static void main(String[] args) { 
			System.out.println(Day.MONDAY);
			} 
	}


