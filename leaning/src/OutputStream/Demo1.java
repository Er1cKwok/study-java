package OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
  public static void main(String[] args) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("fos.txt");
      try {
        fileOutputStream.write("hello, io".getBytes());
        fileOutputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
