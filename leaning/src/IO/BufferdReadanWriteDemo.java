package IO;

import java.io.*;

public class BufferdReadanWriteDemo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("eric.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("eric1.txt"));

    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    br.close();
    bw.close();
  }
}
