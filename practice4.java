import java.io.*;

public class practice4{
  public static void main( String[] args ) throws IOException{
  //int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。    
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );

    int x = Integer.parseInt( br.readLine() );
    System.out.println(x);
    System.out.println(x * x);
    System.out.println(x * x * x);
      
  }
}