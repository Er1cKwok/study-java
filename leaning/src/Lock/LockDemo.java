package Lock;

public class LockDemo {
  public static void main(String[] args) {
    SellTickets sts = new SellTickets();
    Thread t1 = new Thread(sts, "one");
    Thread t2 = new Thread(sts, "Two");
    Thread t3 = new Thread(sts, "Three");

    t1.start();
    t2.start();
    t3.start();
  }
}
