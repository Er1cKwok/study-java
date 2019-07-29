package Calendar;

import java.util.Calendar;

public class CalendarTest {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    System.out.println(year);
    cal.add(Calendar.YEAR, 5);
    year = cal.get(Calendar.YEAR);
    System.out.println(year);
    cal.set(2001, 10, 10);
    year = cal.get(Calendar.YEAR);
    System.out.println(year);
  }
}
