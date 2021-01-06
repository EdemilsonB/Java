import java.util.Scanner;

public class Uri1115 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int x, y ;
        
        do {
            x = teclado.nextInt() ;
            y = teclado.nextInt() ;

            if ( x > 0 && y > 0 ) { System.out.println( "primeiro" ); }
            if ( x > 0 && y < 0 ) { System.out.println( "quarto" ); }
            if ( x < 0 && y < 0 ) { System.out.println( "terceiro" ); }
            if ( x < 0 && y > 0 ) { System.out.println( "segundo" ); }
        }
        while ( x != 0 && y != 0 ) ;
    }
}