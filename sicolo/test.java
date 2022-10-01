package sicolo;

import java.util.Random;

public class test{
  public static void main(String[] ages) {
    double randNum = Math.random();
    if (randNum <= 0.1) {
      System.out.println("大吉");
    } else if (0.1 <= randNum && randNum <= 0.3) {
      System.out.println("中吉");
    } else if (0.3 <= randNum && randNum <= 0.7) {
      System.out.println("吉");
    } else if (0.7 <= randNum && randNum <= 0.9) {
      System.out.println("凶");
    } else if (0.9 <= randNum) {
      System.out.println("大凶");
    }
  }
}
