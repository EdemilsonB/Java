import java.util.Scanner;

public class Uri1070 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int entrada = teclado.nextInt() ;
        
        if ( entrada % 2 == 0 ) { entrada++ ; }

        for ( int i = 1 ; i <= 6 ; i++ ) {
            System.out.println( entrada ) ;
            entrada += 2 ;
        }
    }
}