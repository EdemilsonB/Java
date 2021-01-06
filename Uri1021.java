import java.util.Scanner;

public class Uri1021 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        double valorInformado ;
        int inteiros, centavos, restos ;
        int notas100, notas50, notas20, notas10, notas5, notas2;
        int moedas1, moedas50c, moedas25c, moedas10c, moedas5c, moedas1c;

        valorInformado = teclado.nextDouble();
        inteiros = (int) valorInformado ;
        centavos = (int) ( ( valorInformado - inteiros ) * 100 ) ;

        notas100 = inteiros / 100;
        restos = inteiros % 100;
        notas50 = restos / 50;
        restos = restos % 50;
        notas20 = restos / 20;
        restos = restos % 20;
        notas10 = restos / 10;
        restos = restos % 10;
        notas5 = restos / 5;
        restos = restos % 5;
        notas2 = restos / 2;
        moedas1 = restos % 2;
        moedas50c = centavos / 50;
        restos = centavos % 50;
        moedas25c = restos / 25;
        restos = restos % 25;
        moedas10c = restos / 10;
        restos = restos % 10;
        moedas5c = restos / 5;
        moedas1c = restos % 5;

        System.out.println( "NOTAS:" );
        System.out.println( notas100 + " nota(s) de R$ 100.00" );
        System.out.println( notas50  + " nota(s) de R$ 50.00" );
        System.out.println( notas20  + " nota(s) de R$ 20.00" );
        System.out.println( notas10  + " nota(s) de R$ 10.00" );
        System.out.println( notas5   + " nota(s) de R$ 5.00" );
        System.out.println( notas2   + " nota(s) de R$ 2.00" );
        System.out.println( "MOEDAS:" );
        System.out.println( moedas1   + " moeda(s) de R$ 1.00" );
        System.out.println( moedas50c + " moeda(s) de R$ 0.50" );
        System.out.println( moedas25c + " moeda(s) de R$ 0.25" );
        System.out.println( moedas10c + " moeda(s) de R$ 0.10" );
        System.out.println( moedas5c  + " moeda(s) de R$ 0.05" );
        System.out.println( moedas1c  + " moeda(s) de R$ 0.01" );

    }
}