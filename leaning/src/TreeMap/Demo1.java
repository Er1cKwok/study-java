package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
  public static void main(String[] args) {
    TreeMap<Student, String> tmap = new TreeMap<Student, String>(
      new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
          // 主要条件
          int temp = o1.getAge() - o2.getAge();
          // 次要条件
          int temp2 = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
          return temp2;
        }
      }
    );

    Student s1 = new Student("刘备", 28);
    Student s2 = new Student("关羽", 27);
    Student s3 = new Student("张飞", 26);
    Student s4 = new Student("赵云", 25);
    Student s5 = new Student("赵云", 25);
    tmap.put(s1, "双剑");
    tmap.put(s2, "青龙偃月刀");
    tmap.put(s3, "丈八长矛");
    tmap.put(s4, "飞镖");
    tmap.put(s5, "长枪");
    Set<Student> set = tmap.keySet();
    for (Student key : set) {
      String s = tmap.get(key);
      System.out.println(key.getName() + "--" + key.getAge() + "---" + s);
    }
  }
}
