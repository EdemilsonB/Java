
import java.util.Scanner;

public class Uri1080 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int X, indiceMaior = 0, valorMaior = 0;      
        
        for ( int i = 1 ; i <= 100 ; i++ ) {
        	X = teclado.nextInt();
        	if ( X > valorMaior ) {
        		indiceMaior = i;
        		valorMaior = X;
        	}
        }
        System.out.println( valorMaior );
        System.out.println( indiceMaior );
        teclado.close();
    }
}