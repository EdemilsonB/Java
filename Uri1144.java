import java.util.Scanner;

public class Uri1144 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int quadrado, cubo, qtdeLinhas = teclado.nextInt();

        for ( int i = 1 ; i <= qtdeLinhas ; i++ ) {
            quadrado = i * i ;
            cubo = quadrado * i ;
            System.out.println( i + " " + quadrado + " " + cubo );
            System.out.println( i + " " + ( quadrado + 1 ) + " " + ( cubo + 1 ) );
        }
    }
}