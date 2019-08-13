package IO;

import java.io.*;

public class CopyMethodsDemo {
  public static void main(String[] args) throws IOException {
    String in = "eric.txt";
    String out = "eric5.txt";

//    method1(in, out);
//    method2(in, out);
//    method3(in, out);
//    method4(in, out);
    method5(in, out);
  }

  public static void method1(String inData, String outData) throws IOException {
    FileReader fr = new FileReader(inData);
    FileWriter fw = new FileWriter(outData);

    int by;
    while ((by = fr.read()) != -1) {
      fw.write(by);
      fw.flush();
    }
    fr.close();
    fw.close();
  }

  public static void method2(String inData, String outData) throws IOException {
    FileReader fr = new FileReader(inData);
    FileWriter fw = new FileWriter(outData);

    char[] chs = new char[1024];
    int len;
    while ((len = fr.read(chs)) != -1) {
      fw.write(chs, 0, len);
      fw.flush();
    }

    fr.close();
    fw.close();
  }

  public static void method3(String inData, String outData) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(inData));
    BufferedWriter bw = new BufferedWriter(new FileWriter(outData));

    int by;
    while ((by = br.read()) != -1) {
      bw.write(by);
      bw.flush();
    }
    br.close();
    bw.close();
  }

  public static void method4(String inData, String outData) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(inData));
    BufferedWriter bw = new BufferedWriter(new FileWriter(outData));

    char[] chs = new char[1024];
    int len;
    while ((len = br.read(chs)) != -1) {
      bw.write(chs, 0, len);
      bw.flush();
    }

    br.close();
    bw.close();
  }

  public static void method5(String inData, String outData) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(inData));
    BufferedWriter bw = new BufferedWriter(new FileWriter(outData));

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
