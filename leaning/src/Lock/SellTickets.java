package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTickets implements Runnable{
  private int tickets = 100;
  private Lock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true) {
      lock.lock();
      if (tickets > 0) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "正在销售第" + (tickets--) + "张");
      }
      lock.unlock();
    }
  }
}
