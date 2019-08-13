package File;

import java.io.File;
import java.io.IOException;

public class Demo1 {
  public static void main(String[] args) {
    File file = new File("/Users/eric/Desktop/a");
    try {
      file.mkdir();
    } catch (Exception e) {
      e.printStackTrace();
    }
    File file1 = new File("aa.jpg");
    File file2 = new File("bb.jpg");
    file1.renameTo(file2);
    try {
      file1.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
