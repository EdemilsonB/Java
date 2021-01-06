import java.util.Scanner;

public class Uri1074 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int caso, qtdeCasos = teclado.nextInt() ;
        String msg ;
        
        for ( int i = 1 ; i <= qtdeCasos ; i++ ) {
            msg = "" ;
            caso = teclado.nextInt() ;

            if ( caso == 0 ) { msg = "NULL" ; }
            else {
                if ( caso % 2 == 0 ) { msg = "EVEN " ; }
                else { msg = "ODD " ; }

                if ( caso > 0 ) { msg += "POSITIVE" ; }
                else { msg += "NEGATIVE" ; }
            }

            System.out.println( msg );
        }
    }
}