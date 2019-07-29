package Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Student(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }


  @Override
  public int compareTo(Student o) {
    int num = this.getAge() - o.getAge();
    int num2 = num == 0 ? this.getName().compareTo(o.getName()) : num;
    return num2;
  }
}
