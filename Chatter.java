import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Chatter {

  public static void main(String[] args) {
    TreeMap<String,String> contacts = new TreeMap<>();
    contacts.put("Peter", "902-123-1243");
    contacts.put("Dave","902-133-1243");
    contacts.put("Mark", "982-344-1423");
    System.out.println(contacts);
    System.out.println(contacts.get("Peter"));
  }
}
