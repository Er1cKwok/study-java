package Thread;

public class Demo1 {
  public static void main(String[] args) {
    MyThread mtd1 = new MyThread();
    MyThread mtd2 = new MyThread();
    MyThread mtd3 = new MyThread();
    mtd1.start();
    mtd2.start();
    mtd3.start();
  }
}
