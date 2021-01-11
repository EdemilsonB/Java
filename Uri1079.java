
import java.util.Scanner;

public class Uri1079 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int qtdeX = teclado.nextInt();
        float a, b, c;        
        
        for ( int i = 1 ; i <= qtdeX ; i++ ) {
        	a = teclado.nextFloat();
        	b = teclado.nextFloat();
        	c = teclado.nextFloat();
        	System.out.printf( "%.1f\n" , ( a * 2 + b * 3 + c * 5 ) / 10 );
        }
        teclado.close();
    }
}