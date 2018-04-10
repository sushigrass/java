import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.io.*;
import java.util.regex.*;

class Test {

  int age;
  String name;

  Test(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
      List<Test> testObjects = new ArrayList<Test>();
      Scanner in = new Scanner(System.in);
      int testobjcount = 5;
      for (int i = 0; i < testobjcount; i++) {
        int age = in.nextInt();
        String name = in.next();
        testObjects.add(new Test(age,name));
        System.out.println("Added: "+name+". Age: "+age);
      }
      Collections.sort(testObjects, Comparator.comparing(Test :: getAge).thenComparing(Test :: getName));
      for (Test t: testObjects) {
        System.out.println(t.age+" "+t.name);
      }
  }
}
