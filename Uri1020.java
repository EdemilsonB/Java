import java.util.Scanner;

public class Uri1020 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int diasInformados, restos, anos, meses, dias;

        diasInformados = teclado.nextInt();
        
        anos = diasInformados / 365;
        restos = diasInformados % 365;

        meses = restos / 30;
        dias = restos % 30;
        
        System.out.println( anos + " ano(s)" );
        System.out.println( meses + " mes(es)" );
        System.out.println( dias + " dia(s)" );
    }
}