
import java.util.Scanner;

public class Uri1078 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int entradaN = teclado.nextInt();
        
        for ( int i = 1 ; i <= 10 ; i++ ) { 
        	System.out.println( i + " x " + entradaN + " = " + (i * entradaN ) );
        }
        teclado.close();
    }
}