package Proporties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
  public static void main(String[] args) throws IOException {
    Properties props = new Properties();
//    props.setProperty("姓名", "Eric");
//    props.setProperty("性别", "男");
//    props.setProperty("身高", "180cm");
//
//    FileWriter fw = new FileWriter("test.txt");
//    props.store(fw, null);
    FileReader fr = new FileReader("login.txt");
    props.load(fr);
    System.out.println(props);
  }
}
