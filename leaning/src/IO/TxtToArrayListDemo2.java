package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class TxtToArrayListDemo2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));
    ArrayList<String> arr = new ArrayList<>();
    String line;
    while ((line = br.readLine()) != null) {
      arr.add(line);
    }
    br.close();

    Random r = new Random();
    int luckyKey = r.nextInt(arr.size());
    System.out.println(arr.get(luckyKey));
  }
}
