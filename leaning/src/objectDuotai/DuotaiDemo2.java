package objectDuotai;

class Person1 {
  public void eat() {
    System.out.println("吃饭");
  }
}

class SouthPerson extends Person1 {
  public void eat() {
    System.out.println("南方人吃米饭");
  }

  public void business() {
    System.out.println("南方人经商");
  }
}

class NorthPerson extends Person1 {
  private final int num = 10;
  public void eat() {
    System.out.println("北方人吃面");
  }
  public void count() {
    System.out.println(num);
  }
}

public class DuotaiDemo2 {
  public static void main(String[] args) {
    Person1 p1 = new SouthPerson();
    p1.eat();
    SouthPerson sp = (SouthPerson)p1;
    sp.business();
    sp.eat();
    System.out.println("-----------");
    Person1 p2 = new NorthPerson();
    p2.eat();
    NorthPerson np = (NorthPerson)p2;
    np.count();
    np.eat();
  }
}
