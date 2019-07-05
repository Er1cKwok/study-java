package reinforceFor;

import java.util.*;

public class ForDemo {
  public static void main(String[] args) {
//    Vector<Student> ve = new Vector<Student>();
//    ArrayList<Student> ve = new ArrayList<Student>();
//    List<Student> ve = new ArrayList<Student>();
//    Collection<Student> ve = new HashSet<Student>();
    LinkedList<Student> ve = new LinkedList<Student>();
    Student s1 = new Student("Eric", 25);
    Student s2 = new Student("Janice", 22);
    Student s3 = new Student("Daisy", 21);
    ve.add(s1);
    ve.add(s2);
    ve.add(s3);
    Iterator<Student> it = ve.iterator();
    while (it.hasNext()) {
      Student s = it.next();
      System.out.println(s.getName() + "----" + s.getAge());
    }
    System.out.println("---------");
    for (int i = 0; i < ve.size(); i++) {
      Student s = ve.get(i);
      System.out.println(s.getName() + "----" + s.getAge());
    }
    System.out.println("---------");
    for (Student s : ve) {
      System.out.println(s.getName() + "----" + s.getAge());
    }
  }
}
