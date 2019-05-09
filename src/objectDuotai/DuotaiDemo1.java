package objectDuotai;

class Animal12Demo {
  public void show() {
    System.out.println("animal");
  }
}

class Dog122 extends Animal12Demo {
  public void method() {
    System.out.println("method");
  }
}

public class DuotaiDemo1 {
  public static void main(String[] args) {
    Animal12Demo a12d = new Dog122();
    a12d.show();

    Dog122 a12d1 = (Dog122) a12d;
    a12d1.method();
  }
}
