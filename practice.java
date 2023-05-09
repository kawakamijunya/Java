public class practice{
  
  public static void main( String[] args ){
  //Hello World”と表示するプログラムを作成しなさい。
    System.out.println("Hello World");
    
  //int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。
    int x;
    
    x = 11;
    System.out.println( "x=" + x );
    
  //int 型の変数 a、b に数値 13、17 を代入し、a、b の値を“a=13,b=17”のように表示するプログラムを作成しなさい。
    int a;
    int b;
    
    a = 13;
    b = 17;
    
    System.out.println( "a=" + a + ",b=" + b );
    
  //int 型の変数 c に数値 13 と 17 の和を代入し、c の値を表示するプログラムを作成しなさい。
    int c;
    
    c = 13 + 17;
    System.out.println( "c=" + c );
    
  //数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。
    System.out.println( 13 * 17 );
    
  //次のプログラムを作成しなさい。int 型の変数 d に数値 7 を代入する。変数 d の値を 3 倍にする。
  //変数 d の値を表示する。変数 d の値を半分（1/2）にする。変数 d の値を表示する。
    int d;
    
    d = 7;
    d *= 3;
    System.out.println( "d=" + d );
    d /= 2;
    System.out.println( "d=" + d );
    
  //int 型の変数 e、f に任意の数値を代入し、e の値を f に、f の値を e に入れ替えて e と f の値を表示するプログラムを作成しなさい。
    int e,f,g;
   
    e = 11;
    f = 5;
   
    g = e;
    e = f;
    f = g;
   
    System.out.println( "e=" + e + ",f=" + f );
   
  //int 型の変数 h、i に数値 19、23 を代入し、その積を変数 j に代入して j の値を表示するプログラムを作成しなさい。
    int h,i,j;
  
    h = 19;
    i = 23;
    j = h * i;
  
    System.out.println("j=" + j );
    
  //int 型の変数 k に任意の数値を代入し、k を 2 倍、3 倍、4 倍した結果を表示するプログラムを作成しなさい。
    int k = 5;
    
    System.out.println(k * 2);
    System.out.println(k * 3);
    System.out.println(k * 4);
    
  //int 型の変数 x に任意の数値を代入し、l を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
    int l = 3;
   
    System.out.println(l);
    System.out.println(l * l);
    System.out.println(l * l * l);
    
  //int 型の変数 n に任意の数値を代入し、x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
    int n = 11;
    
    System.out.println("商=" + (n / 5) + ",余り=" + (n % 5));
    
  //int 型の変数 m に任意の数値を代入し、インクリメント演算子、デクリメント演算子を
  //適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。  
    int m = 5;
    
    m++;
    System.out.println(m);
    m--;
    m--;
    m--;
    System.out.println(m);
  
   
  }
}


  