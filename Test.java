import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;

class Test {

  public static void main(String[] args) {

    BufferedWriter bw = null;
    try {
      File file = new File("hello.txt");
      bw = new BufferedWriter(new FileWriter(file));
      String[] strings = {"hello", "lol", "hehhe","bye"};
      for (String s : strings) {
        bw.write(s+System.lineSeparator());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
