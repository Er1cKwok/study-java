package object;

public class demo1 {
  public static void main(String[] args) {
    Student s = new Student();
    s.adress = "Guangzhou";
    s.name = "Eric";
    s.age = 25;
    s.showInfo();
  }
}

class Student {
  String name;
  String adress;
  int age;

  public void showInfo() {
    System.out.println("I am " + name + ", I live in" + adress + ", I am " + age);
  }
}
