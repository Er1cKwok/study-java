package object;

class Person {
  public void eat() {
    System.out.println("I am eating");
  }

  public void sleep() {
    System.out.println("I am sleeping");
  }
}

class Student12 extends Person {}
class Teacher12 extends Person {}

public class ExtendsDemo1 {
  public static void main(String[] args) {
    Student12 s12 = new Student12();
    s12.eat();
    s12.sleep();
    Teacher12 t12 = new Teacher12();
    t12.eat();
    t12.sleep();
  }
}
