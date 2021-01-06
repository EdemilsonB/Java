import java.util.Scanner;

public class Uri1018 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int valorInformado, restos, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        valorInformado = teclado.nextInt();

        notas100 = valorInformado / 100;
        restos = valorInformado % 100;
        notas50 = restos / 50;
        restos %= 50;
        notas20 = restos / 20;
        restos %= 20;
        notas10 = restos / 10;
        restos %= 10;
        notas5 = restos / 5;
        restos %= 5;
        notas2 = restos / 2;
        notas1 = restos % 2;

        System.out.println( valorInformado );
        System.out.println( notas100 + " nota(s) de R$ 100,00" );
        System.out.println( notas50 + " nota(s) de R$ 50,00" );
        System.out.println( notas20 + " nota(s) de R$ 20,00" );
        System.out.println( notas10 + " nota(s) de R$ 10,00" );
        System.out.println( notas5 + " nota(s) de R$ 5,00" );
        System.out.println( notas2 + " nota(s) de R$ 2,00" );
        System.out.println( notas1 + " nota(s) de R$ 1,00" );
    }
}