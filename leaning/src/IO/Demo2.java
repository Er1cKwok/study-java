package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo2 {
  public static void main(String[] args) throws IOException {
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text.txt"));

    osw.write("abc");

    osw.close();
  }
}
