package inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;

public class Demo2 {
  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    byte[] bys = "helloworld".getBytes();

    DatagramPacket dp = new DatagramPacket(bys, bys.length, Inet4Address.getByName("127.0.0.1"), 12345);

    ds.send(dp);
    ds.close();

  }
}
