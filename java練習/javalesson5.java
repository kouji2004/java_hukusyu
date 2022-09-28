//BufferedReaderとは
//BufferedReaderクラスとは、テキストファイルを読み込むためのクラスです。
//BufferedReaderクラスでは、テキストファイルを1行ずつ読み込むreadlineメソッドが用意されています。
//テキストファイルを読み込むクラスにはFileReaderクラスもありますが、こちらはテキストを1文字ずつ読み込むため効率が悪い場合があります。
//そのため、テキストファイルの読み込みはBufferedReaderクラスを使うようにしましょう。


//BufferedReaderの使い方
//BufferedReaderクラスのreadLineメソッドを使って、テキストファイルを1行ずつ読み込む方法を解説します。
//readLineメソッドは指定したテキストファイルを1行ずつ読み込み、String型の戻り値として返します。
//ファイルの終わりに到達した場合は「null」を返します。
//そのため、ファイルの終わりまで読み込む場合には、while文でnullが返されるまでループさせます。
//テキストファイルを1行ずつ読み込む方法について、次のプログラムで確認してみましょう。


package java練習;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class javalesson5 {
  public static void main(String[]ages){
    try{
      //ファイルのパスを指定する
      File file = new File("c:javalesson.java");

      if(!file.exists()){
        System.out.println("ファイルが存在しません");
        return;
      }
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String data;
      while((data = bufferedReader.readLine())!=null){
        System.out.println(data);
      }
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}