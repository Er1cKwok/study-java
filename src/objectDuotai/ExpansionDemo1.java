package objectDuotai;

class Animal1 {
  public void eat() {
    System.out.println("eat");
  }

  public void sleep() {
    System.out.println("sleep");
  }
}

class Animal1Tool {
  public static void useAnimal1(Animal1 a1) {
    a1.eat();
  }
}

class Dog12 extends Animal1{
  public void eat() {
    System.out.println("dog eat");
  }
}

public class ExpansionDemo1 {
  public static void main(String[] args) {
    Dog12 d12 = new Dog12();
    Animal1Tool.useAnimal1(d12);
  }
}
