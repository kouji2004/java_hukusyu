package java練習;

import java.io.FileReader;

public class javalesson6 {
  public static void main(String[]ages){
   int num;
   num = div(5,0);
   System.out.println("戻り値"+num);
  }
  public static int div(int num1, int num2){
    try{
      int num = num1/num2;
      return num;
    }catch(ArithmeticException e){
      System.out.println("例外の処理が発生しました");
      return 0;
    }
  }
}

//Javaのtry-catch文は、プログラム中で例外が発生するか試して(try)、例外が発生したら捕まえて(catch)、何かしらの処理を行いたい場合に使います。

//try-catch文は例外にその場で対処する時に使う
//そんな例外に対処するには、以下の二つの方法があります。
//⓵その場でエラーへ対処する→try-catch文を使う
//⓶その場では例外へは対処せず、処理を中断して呼び出し元に任せる→メソッドのthrows節を使う


//try {
  //例外が発生する可能性のある処理
//} catch (例外の型 引数) {
  //例外が発生した場合の処理(例外が発生しなければ行われない処理)
//} finally {
  //例外の有無に関わらず、最後に必ず実行される処理
//}