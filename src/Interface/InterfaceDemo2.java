package Interface;

interface Smoking {
  public abstract void smoke();
}

abstract class Person2 {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
  public Person2() {}
  public Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void sleep() {
    System.out.println("I am sleeping");
  }
  public abstract void eat();
}

class Student2 extends Person2 {
  public Student2() {}
  public Student2(String name, int age) {
    super(name, age);
  }
  public void eat() {
    System.out.println("I am eating");
  }
}

class SmokeStudent2 extends Person2 implements Smoking {
  public void eat() {
    System.out.println("I ate dinner");
  }
  public void smoke() {
    System.out.println("I smoke every day");
  }
}

public class InterfaceDemo2 {
  public static void main(String[] args) {
    Person2 p2 = new Student2();
    p2.setAge(18);
    p2.setName("Eric");
    p2.sleep();
    System.out.println(p2.getName() + "---" + p2.getAge());
    System.out.println("-------");
    SmokeStudent2 sk2 = new SmokeStudent2();
    sk2.smoke();
    sk2.eat();
  }
}
