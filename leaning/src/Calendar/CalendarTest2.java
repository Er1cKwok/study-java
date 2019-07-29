package Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    Calendar cal = Calendar.getInstance();
    cal.set(year, 2, 1);
    cal.add(Calendar.DATE, -1);
    System.out.println(cal.get(Calendar.DATE));
  }
}
