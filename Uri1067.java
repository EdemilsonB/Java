import java.util.Scanner;

public class Uri1067 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int entrada = teclado.nextInt() ;
        
        for ( int i = 1; i <= entrada ; i += 2 ) {
            System.out.println( i ) ;
        }
    }
}