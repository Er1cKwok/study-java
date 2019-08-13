package PrintStream;

import java.io.*;

public class Demo1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("info.txt"));
    PrintWriter pw = new PrintWriter(new FileWriter("1.txt"), true);

    String ling = null;
    while ((ling = br.readLine()) != null) {
      pw.println(ling);
    }
    br.close();
    pw.close();
  }
}
