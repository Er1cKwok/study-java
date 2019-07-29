package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Demo2 {
  public static void main(String[] args) {
    HashMap<Student, String> map = new HashMap<Student, String>();
    Student s1 = new Student("Eric", 23);
    Student s2 = new Student("Janice", 22);
    Student s3 = new Student("Eric", 23);

    map.put(s1, "aaa");
    map.put(s2, "bbb");
    map.put(s3, "ccc");
    Set<Student> set = map.keySet();
    for (Student s : set) {
      String a = map.get(s);
      System.out.println(s.getName() + "---" + s.getAge() + "---" + a);
    }

  }
}
