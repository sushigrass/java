import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

class Test {

  public static void main(String[] args) {

    Singleton p1 = Singleton.getInstance();
    System.out.println(p1.getLetterList());
    LinkedList<String> p1Tiles = p1.getTiles(7);
    System.out.println(p1.getLetterList());
    System.out.println("p1 tiles: "+p1Tiles);

    Singleton p2 = Singleton.getInstance();
    System.out.println(p2.getLetterList());
    LinkedList<String> p2Tiles = p2.getTiles(7);
    System.out.println(p2.getLetterList());
    System.out.println("p2 tiles: "+p2Tiles);

  }
}
