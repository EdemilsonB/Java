
import java.util.Scanner;

public class Uri1075 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int entradaN = teclado.nextInt();
        
        for ( int i = 1 ; i <= 10000 ; i++ ) { if ( i % entradaN == 2 ) { System.out.println(i); } }

        teclado.close();
    }
}