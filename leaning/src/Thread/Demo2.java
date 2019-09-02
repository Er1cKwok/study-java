package Thread;

public class Demo2 {
  public static void main(String[] args) {
    ThreadRunableDemo trd = new ThreadRunableDemo();
    Thread td1 = new Thread(trd, "Eric");
    Thread td2 = new Thread(trd, "Janice");

    td1.start();
    td2.start();
  }
}
