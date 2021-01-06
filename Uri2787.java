import java.util.Scanner;

public class Uri2787 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int linha = teclado.nextInt() ;
        int coluna = teclado.nextInt() ;

        if ( ( linha + coluna ) % 2 == 0 ) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}