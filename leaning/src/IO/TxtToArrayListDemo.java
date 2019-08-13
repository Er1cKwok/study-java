package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("a.txt"));

    ArrayList<String> arr = new ArrayList<>();

    String line;
    while ((line = br.readLine()) != null) {
      arr.add(line);
    }

    br.close();
    System.out.println(arr);
  }
}
