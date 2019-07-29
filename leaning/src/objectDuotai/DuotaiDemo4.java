package objectDuotai;

abstract class Student123 {
  private String name;
  private int age;

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void study();
  public Student123() {}
  public Student123(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class WorkStudent extends Student123{
  public void study() {
    System.out.println("努力学习");
  }
  public WorkStudent() {

  }
  public WorkStudent(String name, int age) {
    super(name, age);
  }
}

class GoodStudent extends Student123 {
  private String read;
  public GoodStudent() {}
  public GoodStudent(String name, int age, String read) {
    super(name, age);
    this.read = read;
  }

  public void setRead(String read) {
    this.read = read;
  }
  public String getRead() {
    return read;
  }

  public void study() {
    System.out.println("学霸，不用学习");
  }

}
public class DuotaiDemo4 {
  public static void main(String[] args) {
    Student123 s123 = new WorkStudent();
    s123.setAge(14);
    s123.setName("Eric");
    System.out.println(s123.getAge() + "---" + s123.getName());
    s123.study();
    System.out.println("-------");
    s123 = new WorkStudent("Janice", 13);
    System.out.println(s123.getAge() + "---" + s123.getName());
    System.out.println("-------");

    // 子类特有的东西，用具体类实现
    GoodStudent gs = new GoodStudent();
    gs.setAge(15);
    gs.setName("Daisy");
    gs.setRead("book");
    System.out.println(s123.getAge() + "---" + s123.getName() + "---" + gs.getRead());

  }
}
