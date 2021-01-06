import java.util.Scanner;

public class Uri1004 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int entradaA, entradaB, prod ;
        
        entradaA = teclado.nextInt() ;
        entradaB = teclado.nextInt() ;

        prod = entradaA * entradaB ;

        System.out.println( "PROD = " + prod ) ;
    }
}