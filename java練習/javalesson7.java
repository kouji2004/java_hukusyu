package java練習;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class javalesson7 {
  public static void main(String[] ages) {
    // 1.ファイルのパスを指定する
    File file = new File("c:javalesson2.java");

    // 2.ファイルが存在しない場合に例外が発生するので確認する
    if (!file.exists()) {
      System.out.println("ファイルが存在しません");
      return;
    }

    // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
    FileReader fileReader = null;
    try {
      fileReader = new FileReader(file);
      int data;
      while ((data = fileReader.read()) != -1) {
        System.out.print((char) data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // 4.最後にファイルを閉じてリソースを開放する
      try {
        if (fileReader != null) {
          fileReader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}


//finallyで必ず実行する処理を記述する方法
//finallyブロックの中の処理は、例外の有無に関わらず、最後に必ず実行されます。
//finallyはファイルを開いた後に確実にcloseメソッドで閉じたいときなどに使用されます。




