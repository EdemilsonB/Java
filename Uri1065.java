import java.util.Scanner;

public class Uri1065 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int entrada , pares = 0;

        for ( int i = 1; i <= 5 ; i ++ ) {
            entrada = teclado.nextInt() ;
            if ( entrada % 2 == 0 ) {
                pares++ ;
            }
        }

        System.out.println( pares + " valores pares") ;
        
    }
}