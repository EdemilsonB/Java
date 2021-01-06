import java.util.Scanner;

public class Uri1143 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int qtdeLinhas = teclado.nextInt();

        for ( int i = 1 ; i <= qtdeLinhas ; i++ ) {
            System.out.println( i + " " + ( i * i ) + " " + ( i * i * i ) );
        }
    }
}