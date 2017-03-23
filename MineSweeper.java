import java.util.*;

public class MineSweeper {
  public static void main(String[] args) {
    final int mapWidth = 10;
    final int mapHeight = 10;
    ArrayList<Integer> Map = generateMap(mapWidth, mapHeight);

  }

  public static ArrayList<Integer> initMap(int width, int height) {
    ArrayList<Integer> initializedmap = new ArrayList<>();
    for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            initializedmap.add(0);
        }
    }
    return initializedmap;  
  }
}