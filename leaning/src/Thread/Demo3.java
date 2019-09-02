package Thread;

public class Demo3 {
  public static void main(String[] args) {
    SellTicketsImpl si = new SellTicketsImpl();
    Thread t1 = new Thread(si, "窗口1");
    Thread t2 = new Thread(si, "窗口2");
    Thread t3 = new Thread(si, "窗口3");

    t1.start();
    t2.start();
    t3.start();
  }
}
