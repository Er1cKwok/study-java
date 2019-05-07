package object;

class Animal {
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

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void eat() {
    System.out.println("It's time to eat");
  }
}

class Dog extends Animal {
  public Dog() {}
  public Dog(String name, int age) {
    super(name, age);
  }

  public void bark() {
    System.out.println("I am barking");
  }
}

public class ExtendsTest {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setAge(1);
    d1.setName("Lucky");
    d1.eat();
    d1.bark();
    System.out.println(d1.getName() + "-----" + d1.getAge());
    System.out.println("-----------------");
    Dog d2 = new Dog("Jacky", 2);
    System.out.println(d2.getName() + "-----" + d2.getAge());
    d2.eat();
    d2.bark();
  }
}
