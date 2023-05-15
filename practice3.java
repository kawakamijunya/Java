import java.io.*;

public class practice3{
  public static void main( String[] args ) throws IOException{
  //int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。    
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );

    int x = Integer.parseInt( br.readLine() );
    System.out.println( x );
      
  }
}