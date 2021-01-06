import java.util.Scanner;

public class Uri2780 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int distancia = teclado.nextInt() ;
        int pontos = 0 ;
        
        if ( distancia <= 800 ) {
            pontos = 1 ;
        }
        else if ( distancia > 1400 ) {
            pontos = 3 ;
        }
        else {
            pontos = 2 ;
        }
        System.out.println( pontos ) ;
    }
}