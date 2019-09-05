package inet.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Demo1 {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("127.0.0.1", 8888);
    OutputStream os = s.getOutputStream();
    os.write("helloworld".getBytes());

    s.close();
  }
}
