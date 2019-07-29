package LinkedListDemo;

public class MyStackDemo {
  public static void main(String[] args) {
    MyStack ms = new MyStack();
    ms.add("hello");
    ms.add("hi");
    ms.add("java");

    while (!ms.isEmpty()) {
      System.out.println(ms.get());
    }
  }
}
