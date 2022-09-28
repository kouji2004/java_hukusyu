package java練習;

import java.time.LocalDate;

public class javalesson4 {
  public static void main(String[] ages) {
    java.time.LocalDate Id = java.time.LocalDate.now();
    System.out.println(Id);
  }
}

// Java ではあらかじめ用意されたクラスを自分のプログラムの中で利用することができます。
// クラスを利用するには java.util.regex.Pattern のようにクラス名にパッケージ名を
// 加えた完全修飾名で記述する必要がありますが、あらかじめ import 宣言を行っておくことで
// クラス名だけで記述することができます。

// 完全修飾名を使ったクラスの利用
// Java ではあらかじめ用意されたクラスや自分で作成したクラスを利用することができま
// す。例として日付の情報を扱う LocalDate クラスを利用してみます。 LocalDate クラスで
// 用意されているクラスメソッドである now メソッドを次のように実行してみます

// プログラムの中で同じパッケージに含まれていないクラスを利用するためには、パッケー
// ジ名を含めて記述する必要があります。 LocalDate クラスは java.time パッケージの中に
// 含まれているので次のように java.time.LocalDate と記述します。
