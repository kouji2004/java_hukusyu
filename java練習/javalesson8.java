package java練習;

public class javalesson8 {
  public static void main(String[]ages){
    int num;
    num = div(6,0);
    System.out.println("戻り値="+num);
  }
  public static int div(int num1, int num2){
    try{
      if(num2 == 0){
        throw new ArithmeticException("0で割ったときの例外を発生");
      } 
      int num = num1/num2;
      return num;
    }catch(Exception e){
      System.out.println("例外が発生しました");
      return 0;
    }
  }
}
