import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Singleton {

  String[] scrabbleLetters = "abcdefghijklmnopqrstuvwxyz".split("");
  private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

  static boolean firstThread = true;
  private static Singleton soleInstance = null;

  private Singleton() {}

  public static Singleton getInstance() {
    if (soleInstance==null){
      if (firstThread) {
        firstThread = false;
        Thread.currentThread();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e){
          e.printStackTrace();
        }
      synchronized(Singleton.class) {
        if (soleInstance==null){
          soleInstance = new Singleton();
        }
      }

      }
    }
    return soleInstance;
  }

  public LinkedList<String> getLetterList() {
    return soleInstance.letterList;
  }

  public LinkedList<String> getTiles(int howManyTiles) {
    LinkedList<String> tilesToSend = new LinkedList<String>();
    for (int i = 0; i <= howManyTiles; i++){
      tilesToSend.add(soleInstance.letterList.remove(0));
    }
    return tilesToSend;
  }
}
