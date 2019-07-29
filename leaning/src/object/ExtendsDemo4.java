package object;

class Person5 {
  private int age;
  private String name;

  public Person5() {}

  public Person5 (int age, String name) {
    this.name = name;
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

class Student5 extends Person5 {
  public Student5() {}

  public Student5(int age, String name) {
    super(age, name);
  }
}

public class ExtendsDemo4 {
  public static void main(String[] args) {
    Student5 s5 = new Student5();
    s5.setAge(18);
    s5.setName("Eric");
    System.out.println(s5.getName() + "-----" + s5.getAge());

    Student5 s6 = new Student5(18, "Er22");
    System.out.println(s6.getName() + "-----" + s6.getAge());
  }
}
