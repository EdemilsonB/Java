import java.util.Scanner;

public class Uri1160 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int qtdeCasos = teclado.nextInt();

        for ( int i = 1 ; i <= qtdeCasos ; i++ ) {
            int popA = teclado.nextInt();
            int popB = teclado.nextInt();
            double taxaA = teclado.nextDouble();
            double taxaB = teclado.nextDouble();
            int anos = 0;

            taxaA = taxaA / 100;
            taxaB = taxaB / 100;

            while ( anos <= 101 && popA <= popB ) {
                popA += (int) ( popA * taxaA );
                popB += (int) ( popB * taxaB );
                anos++;
            }

            if ( anos > 100 ) {
                System.out.println( "Mais de 1 seculo." );
            }
            else {
                System.out.println( anos + " anos." );
            }
        }
    }
}