package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
  public static void main(String[] args) {
    Student s1 = new Student("关羽", 24);
    Student s2 = new Student("张飞", 25);
    Student s3 = new Student("赵云", 26);
    Student s4 = new Student("马超", 27);
    Student s5 = new Student("黄忠", 28);

    List<Student> list = new ArrayList<Student>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);

    Collections.sort(list);
    for (Student s : list) {
      System.out.println(s.getName() + "---" +s.getAge());
    }
  }
}
