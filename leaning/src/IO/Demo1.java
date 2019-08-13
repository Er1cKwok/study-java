package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("fos.txt");

    int by = 0;
    while ((by = fis.read()) != -1) {
      System.out.print((char) by);
    }

    fis.close();
  }
}
