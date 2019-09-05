package reflect;

import java.lang.reflect.Constructor;

public class Demo2 {
  public static void main(String[] args) throws Exception {
    Class c = Class.forName("reflect.Person");

    Constructor con = c.getDeclaredConstructor(String.class);

    con.setAccessible(true);

    Object obj = con.newInstance("Janice");
    System.out.println(obj.toString());
  }
}
