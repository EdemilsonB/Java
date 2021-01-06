import java.util.Scanner;

public class Uri1142 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int j = 0, qtdeLinhas = teclado.nextInt();

        for ( int i = 1 ; i <= qtdeLinhas ; i++ ) {
            System.out.println( (i + j ) + " " + ( i + j + 1 ) + " " + ( i + j + 2 ) + " PUM" );
            j += 3;
        }
    }
}