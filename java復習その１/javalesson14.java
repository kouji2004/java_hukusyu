public class javalesson14 {
  public static void main(String[]ages){
    int num = 9;
    for (int i = 1; i < 10; i++) {
      if ((!(i == num)) && (!(i == (num + 1)))) {
          System.out.println(i);
      }
    }
  }
}
