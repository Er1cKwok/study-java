package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("fos.txt");
    FileWriter fw = new FileWriter("fos3.txt");

//    int by = 0;
//    while ((by = fr.read()) != -1) {
//      fw.write(by);
//      fw.flush();
//    }
    char[] chs = new char[1024];
    int len = 0;
    while ((len = fr.read(chs)) != -1) {
      fw.write(chs, 0, len);
      fw.flush();
    }

    fr.close();
    fw.close();
  }
}
