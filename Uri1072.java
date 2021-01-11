
import java.util.Scanner;

public class Uri1072 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int qtdeX = teclado.nextInt();
        int X = 0, in = 0, out = 0;
        
        for ( int i = 1 ; i <= qtdeX ; i++ ) {
        	X = teclado.nextInt();
        	if ( X >= 10  &&  X <= 20 ) { in++; }
        	else { out++; }       	
        }
        
        System.out.println( in + " in" );
        System.out.println( out + " out" );
        teclado.close();
    }
}