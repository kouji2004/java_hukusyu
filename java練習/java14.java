package java練習;

import java.util.ArrayList;

public class java14 {
  public static void main(String[] ages) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(20);
    points.add(30);
    for (int i : points) {
      System.out.println(i);
    }
  }
}
