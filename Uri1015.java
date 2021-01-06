import java.util.Scanner;
import java.lang.Math;

public class Uri1015 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        double x1, y1, x2, y2, distancia ;
        
        x1 = teclado.nextDouble() ;
        y1 = teclado.nextDouble() ;
        x2 = teclado.nextDouble() ;
        y2 = teclado.nextDouble() ;
        
        distancia = Math.sqrt( Math.pow( x2 - x1 , 2 ) + Math.pow( y2 - y1 , 2 ) ) ;

        System.out.printf( "%.4f\n" , distancia ) ;
    }
}