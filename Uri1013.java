import java.util.Scanner;
import java.lang.Math;

public class Uri1013 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int a, b, c ;
        int maiorAB, maiorBC, maiorAC ;
        
        a = teclado.nextInt() ;
        b = teclado.nextInt() ;
        c = teclado.nextInt() ;

        maiorAB = ( a + b + Math.abs( a - b ) ) / 2 ;
        maiorBC = ( b + c + Math.abs( b - c ) ) / 2 ;
        maiorAC = ( a + c + Math.abs( a - c ) ) / 2 ;

        if ( maiorAB == a  &&  maiorAC == a ) {
            System.out.println( a + " eh o maior" );
        }
        else if ( maiorAB == b  &&  maiorBC == b ) {
            System.out.println( b + " eh o maior" );
        }
        else {
            System.out.println( c + " eh o maior" );
        }
    }
}