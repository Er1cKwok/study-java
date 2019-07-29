package object;

public class demo2 {
  public static void main(String[] args) {
    Student1 s = new Student1();
    s.setAge(25);
    s.setName("Eric");
    System.out.println(s.getAge() + "---" + s.getName());
  }
}

class Student1 {
  private String name;
  private int age;

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
