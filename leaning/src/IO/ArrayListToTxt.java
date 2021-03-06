package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxt {
  public static void main(String[] args) throws IOException {
    ArrayList<String> arr = new ArrayList<>();
    arr.add("Hello");
    arr.add("world");
    arr.add("java");
    BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

    for (String s : arr) {
      bw.write(s);
      bw.newLine();
      bw.flush();
    }

    bw.close();
  }
}
