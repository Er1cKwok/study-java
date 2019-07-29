package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
  public static void main(String[] args) throws ParseException {
    Date d = new Date();
    SimpleDateFormat sfm = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    String a = sfm.format(d);
    System.out.println(a);
    String aaa = "2008-1-3 12:23:2";
    SimpleDateFormat sfm1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date dd = sfm1.parse(aaa);
    System.out.println(dd);
  }
}
