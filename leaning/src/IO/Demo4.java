package IO;

import java.io.*;

public class Demo4 {
  public static void main(String[] args) throws IOException {
    InputStreamReader irs = new InputStreamReader(new FileInputStream("text.txt"));
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text2.txt"));

//    int by = 0;
//    while ((by = irs.read()) != -1) {
//      osw.write(by);
//    }
    char[] chars = new char[1024];
    int len = 0;
    while ((len = irs.read(chars)) != -1) {
      osw.write(chars, 0, len);
      osw.flush();
    }

    irs.close();
    osw.close();
  }
}
