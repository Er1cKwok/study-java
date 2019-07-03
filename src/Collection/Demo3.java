package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {
  public static void main(String[] args) {
    Collection c = new ArrayList();
    Student s1 = new Student("Eric", 24);
    Student s2 = new Student("Janice", 18);
    c.add(s1);
    c.add(s2);

    Iterator it = c.iterator();
    while (it.hasNext()) {
      Student s = (Student) it.next();
      System.out.println(s.getName() + "-----" + s.getAge());
    }
  }
}
