package objectDuotai;

abstract class Animal {
  private String name;
  private int age;
  public Animal() {}
  public Animal(String name, int age) {
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

  public abstract void eat();
}

class Cat extends Animal {
  public Cat() {}
  public Cat(String name, int age) {
    super(name, age);
  }
  public void eat() {
    System.out.println("猫吃鱼");
  }

}

public class DuotaiDemo3 {
  public static void main(String[] args) {
    Cat c = new Cat();
    c.setAge(18);
    c.setName("Cat");
    System.out.println(c.getName() + "---" + c.getAge());
    System.out.println("--------");
    Cat c1 = new Cat("旺财", 2);
    System.out.println(c1.getAge() + "----" + c1.getName());
  }
}
