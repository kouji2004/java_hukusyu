package java練習;

import java.time.LocalDate;//←今回の説明

public class javalesson3 {
  public static void main(String[] ages) {
    LocalDate Id = LocalDate.now();
    System.out.println(Id);
  }
}

//import宣言を行う
//完全修飾名で記述すればクラスを利用することができますが、パッケージ名を含めた名前
//を毎回入力するのは大変です。そこで import 文を使用します。 import 文を使ってクラスを
//インポート宣言すると、パッケージ名を省略してクラス名だけでプログラムの中に記述で
//きるようになります。

//import 宣言は次のように行います。
//⓵import パッケージ名.クラス名
//⓶import 宣言はクラスの定義を行うよりも前に行ってください。

