package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo3 {
  public static void main(String[] args) throws Exception{
    Class c = Class.forName("reflect.Person");

    Constructor con = c.getConstructor();
    Object obj = con.newInstance();
    Field name = c.getDeclaredField("name");
    name.setAccessible(true);
    name.set(obj, "Eric");
    System.out.println(obj);

  }
}
