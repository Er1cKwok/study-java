package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
  public static void main(String[] args) {
    Student s1 = new Student("Eric", 25);
    Student s2 = new Student("Janice", 18);

    Collection c = new ArrayList();
    c.add(s1);
    c.add(s2);

    Object[] objs = c.toArray();
    for (int i = 0; i < objs.length; i++) {
      Student sss = (Student) objs[i];
      System.out.println(sss.getName() + "----" + sss.getAge());
    }
  }
}
