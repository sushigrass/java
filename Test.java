import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Test {

  public static void main(String[] args) {
    System.out.println(fiveLetterWordstoFive("hello my name is petor gillis hahah"));

  }
  public static String fiveLetterWordstoFive(String word) {
    return word.replaceAll("\\b[\\w]{5}\\b","five");
  }
}
