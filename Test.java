import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Test {

  public static void main(String[] args) {
      String peter = "peter";
      String peret = "peret";
      String perep = "perep";
      System.out.println(isAnagram(peter, peret));
      System.out.println(isAnagram(perep, peter));

  }
  public static boolean isAnagram(String a, String b) {
      char[] aString = a.toCharArray();
      char[] bString = b.toCharArray();
      Arrays.sort(aString);
      Arrays.sort(bString);
      return Arrays.equals(bString,aString);
  }
}
