import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Test {

  public static void main(String[] args) {

    String sent = "hello My name is peter lol Capital CAaaaa";
    System.out.println(onlyCapitals(sent));
  }

  public static String onlyCapitals(String sentence) {

    Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
    Matcher matcher = p.matcher(sentence);
    List<String> sentenceCaps = new ArrayList<>();
    while(matcher.find()){
        System.out.println(matcher.group());
        sentenceCaps.add(matcher.group());
    }
    return String.join(" ",sentenceCaps);
  }




}
