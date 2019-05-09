package Interface;

interface Person {
  public abstract void eat();
}
class Student implements Person {
  public void eat() {
    System.out.println("I am eating");
  }
}

public class InterfaceDemo1 {
  public static void main(String[] args) {
    Person p = new Student();
    p.eat();
  }
}
