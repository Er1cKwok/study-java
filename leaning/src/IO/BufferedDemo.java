package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
  public static void main(String[] args) {
    BufferedWriter bw;

    {
      try {
        bw = new BufferedWriter(new FileWriter("eric.txt"));
        bw.write("Hello");
        bw.flush();
        bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
