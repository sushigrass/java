import java.util.*;
import java.io.*;

class CompareStudent implements Comparable<CompareStudent>{
  int rollno;
  String name;
  int age;

  CompareStudent(int rollno,String name,int age){
    this.rollno=rollno;
    this.name=name;
    this.age=age;
  }

  public int compareTo(CompareStudent st){
    if(age==st.age)
    return 0;
    else if(age>st.age)
    return 1;
    else
    return -1;
  }
  public static void main(String[] args) {
    ArrayList<CompareStudent> al=new ArrayList<CompareStudent>();
    al.add(new CompareStudent(101,"Vijay",23));
    al.add(new CompareStudent(106,"Ajay",27));
    al.add(new CompareStudent(105,"Jai",21));

    Collections.sort(al);
    for(CompareStudent st:al){
    System.out.println(st.rollno+" "+st.name+" "+st.age);
    }
  }

}
