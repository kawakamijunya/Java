import java.io.*;  //java.ioという名前のパッケージに含まれている全てのクラスとインターフェイスをimportする

public class practice2{
  public static void main( String[] args ) throws IOException{  //throws IOException 例外を処理する場所をメソッドの呼び出し元にしたい時に使用するもの
  
  //String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );

    String  s = br.readLine();
    System.out.println(s);
    
  
        
      
  }
}
