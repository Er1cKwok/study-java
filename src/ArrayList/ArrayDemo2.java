package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo2 {
  public static void main(String[] args) {
    ArrayList<Student> arraylis = new ArrayList<Student>();


    Student s1 = new Student("Eric", 25);
    Student s2 = new Student("Janice", 24);
    Student s3 = new Student("Daisy", 22);
    arraylis.add(s1);
    arraylis.add(s2);
    arraylis.add(s3);

    Iterator<Student> it = arraylis.iterator();
    while (it.hasNext()) {
      Student s = it.next();
      System.out.println(s);
    }
  }
}
