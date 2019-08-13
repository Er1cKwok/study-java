package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(new FileInputStream("text.txt"));
//    int by = 0;
//    while ((by = isr.read()) != -1) {
//      System.out.print((char) by);
//    }
    char[] chars = new char[1024];
    int len = 0;
    while ((len = isr.read(chars)) != -1) {
      System.out.print(new String(chars, 0, len));
    }

    isr.close();
  }
}
