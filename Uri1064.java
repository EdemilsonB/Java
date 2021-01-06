import java.util.Scanner;

public class Uri1064 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        float entrada , soma = 0 ;
        int positivos = 0 ;

        for ( int i = 1; i <= 6 ; i ++ ) {
            entrada = teclado.nextFloat() ;
            if ( entrada > 0 ) {
                positivos++ ;
                soma += entrada ;
            }
        }

        System.out.println( positivos + " valores positivos") ;
        System.out.printf( "%.1f\n" , soma / positivos );
        
    }
}