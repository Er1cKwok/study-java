package inet;

import java.io.IOException;
import java.net.*;

public class Demo1 {
  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket(12345);
    byte[] bys = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bys, bys.length);

    ds.receive(dp);

    String ip = dp.getAddress().getHostAddress();
    String s = new String(dp.getData(), 0, dp.getLength());

    System.out.println(ip + "is" + s);
    ds.close();
  }
}
