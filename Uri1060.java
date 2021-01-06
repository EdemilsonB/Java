import java.util.Scanner;

public class Uri1060 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        float entrada ;
        int positivos = 0 ;

        for ( int i = 1; i <= 6 ; i ++ ) {
            entrada = teclado.nextFloat() ;
            if ( entrada > 0 ) {
                positivos++ ;
            }
        }

        System.out.println( positivos + " valores positivos") ;
        
    }
}