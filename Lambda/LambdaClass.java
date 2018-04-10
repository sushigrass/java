import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class LambdaClass {


  String name;
  int age;

  public LambdaClass(String name, int age){
    this.name = name;
    this.age = age;

  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }
  public static void main(String[] args) {

      //Using interface
      DoubleFunction doubleFunction = (int a) -> a * 2;
      System.out.println(doubleFunction.doubleFunc(5));

      //Inline Comparator
      List<LambdaClass> list = new ArrayList<LambdaClass>();
      list.add(new LambdaClass("peter",6));
      list.add(new LambdaClass("zeter",63));
      list.add(new LambdaClass("beter",630));
      list.add(new LambdaClass("geter",6300));

      for (LambdaClass human : list){
        System.out.println(human.getName()+" : "+human.getAge());
      }
      //Inline lambda sort
      list.sort((l1, l2) -> l1.getName().compareTo(l2.getName()));

      for (LambdaClass human : list){
        System.out.println(human.getName()+" : "+human.getAge());
      }
      //multiple sort
      Collections.sort(list,Comparator.comparing(LambdaClass::getAge).thenComparing(LambdaClass::getName));

      for (LambdaClass human : list){
        System.out.println(human.getName()+" : "+human.getAge());
      }



  }
}
