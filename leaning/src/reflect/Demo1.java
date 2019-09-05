package reflect;

import java.lang.reflect.Constructor;

public class Demo1 {
  public static void main(String[] args) throws Exception {
    Class c = Class.forName("reflect.Person");

    Constructor con = c.getConstructor(String.class, int.class);

    Object obj = con.newInstance("Eric", 25);

    System.out.println(obj.toString());
  }
}
