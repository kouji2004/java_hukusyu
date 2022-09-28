package java練習;

public class javalesson9 {
  public static void main(String[]ages) {
    int num = 0;
    try{
      num = div(5,0);
    }catch(Exception e){
      System.out.println("例外が発生しました");
    }
    System.out.println("戻り値="+num);
  }
  public static int div(int num1, int num2) throws ArithmeticException{
    int num = num1/num2;
    return num;
  }
}
