import java.util.*;

public class MineSweeper {  
  static final int MAPWIDTH = 10;
  static final int MAPHEIGHT = 10;
  static final int MINESUM = 10;
  static ArrayList<Integer> mineMap;

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
    for (int i = 0; i < MINESUM;) {
      int  n = rand.nextInt(MAPWIDTH * MAPHEIGHT);
      if (checkMine(map, n)) {
        map = addIndicator(map, n);
        map.set(n, 9);
        i++;
      }
    }    
    return map;
  }

  public static boolean checkMine(ArrayList<Integer> map, int item) {    
    if (map.get(item) >= 9) {
      return false;
    } 
    else {
      return true;
    }
  }

  public static ArrayList<Integer> addIndicator(ArrayList<Integer> map, int item) {
    for (int i = -1; i < 2; i++) {
      for (int j = -1; j < 2; j++) {
        int selecteditem = item + 1 * i + MAPWIDTH * j;
        if (selecteditem >= 0 && selecteditem < MAPWIDTH * MAPHEIGHT) {
          int itemvalue = map.get(selecteditem);
          map.set(selecteditem, itemvalue++);
        }
      }
    }
    return map;
  }
}