import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Test {

  static {
    
  }
  public static void main(String[] args) {
      int a = 6;
      String str = a > 10 ? "Hello" : "Hi";
      System.out.println(str);
      System.out.println(7/2);
  }
  public static String fiveLetterWordstoFive(String word) {
    return word.replaceAll("\\b[\\w]{5}\\b","five");
  }
}
