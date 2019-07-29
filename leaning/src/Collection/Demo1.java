package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
  public static void main(String[] args) {
    Collection c = new ArrayList();
    c.add("Hello");
    c.add("World");
    Object[] objs = c.toArray();
    for (int i = 0; i < objs.length; i++) {
      String s = (String) objs[i];
      System.out.println(s.length());
    }
  }
}
