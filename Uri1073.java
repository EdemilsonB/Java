import java.util.Scanner;

public class Uri1073 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int valorInformado = teclado.nextInt() ;

        for ( int i = 2 ; i <= valorInformado ; i += 2 ) {
            System.out.printf( "%d^2 = %d\n", i, ( i * i ) ) ;
        }
    }
}