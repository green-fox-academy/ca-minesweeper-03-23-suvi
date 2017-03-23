import java.util.*;

public class MineSweeper {  
  static final int MAPWIDTH = 10;
  static final int MAPHEIGHT = 10;
  static final int MINESUM = 10;

  public static void main(String[] args) {
    fillMap(initMap());
  }

  public static ArrayList<Integer> initMap() {
    ArrayList<Integer> initializedmap = new ArrayList<>();
    for (int i = 0; i < MAPWIDTH; i++) {
      for (int j = 0; j < MAPHEIGHT; j++) {
        initializedmap.add(0);
      }
    }
    return initializedmap;  
  }

  public static ArrayList<Integer> fillMap(ArrayList<Integer> map) {    
    Random rand = new Random();
    for (int i = 0; i < MINESUM; i++) {
      int  n = rand.nextInt(MAPWIDTH * MAPHEIGHT);
      map.set(n, 9);
    }
    return new ArrayList<>();
  }
}