package java練習;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class javalesson10 {
  public static void main(String[]ages){
    File file = new File("c:javalesson.java");
    FileReader fileReader = null;
    try{
      fileReader = new FileReader(file);
      int data;
      while((data = fileReader.read())!=-1){
        System.out.println((char)data);
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
