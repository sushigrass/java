import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    public void run() {
      Singleton p1 = Singleton.getInstance();
      System.out.println(p1.getLetterList());
      System.out.println(System.identityHashCode(p1));
      LinkedList<String> p1Tiles = p1.getTiles(7);
      System.out.println("p1 tiles: "+p1Tiles);

      Singleton p2 = Singleton.getInstance();
      System.out.println(p2.getLetterList());
      System.out.println(System.identityHashCode(p2));
      LinkedList<String> p2Tiles = p2.getTiles(7);
      System.out.println("p2 tiles: "+p2Tiles);
    }
}
