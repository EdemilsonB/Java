import java.util.Scanner;

public class Uri1038 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int codigo, quantidade ;
        double valorCachorroQuente, valorXSalada, valorXBacon, valorTorradaSimples, valorRefrigerante;
        valorCachorroQuente = 4.0 ;
        valorXSalada = 4.5 ;
        valorXBacon = 5.0 ;
        valorTorradaSimples = 2.0 ;
        valorRefrigerante = 1.5 ;
        
        codigo = teclado.nextInt() ;
        quantidade = teclado.nextInt() ;

        if ( codigo == 1 ) {
            System.out.printf( "Total: R$ %.2f%n", quantidade * valorCachorroQuente );
        }
        else if ( codigo == 2 ) {
            System.out.printf( "Total: R$ %.2f%n", quantidade * valorXSalada );
        }
        else if ( codigo == 3 ) {
            System.out.printf( "Total: R$ %.2f%n", quantidade * valorXBacon );
        }
        else if ( codigo == 4 ) {
            System.out.printf( "Total: R$ %.2f%n", quantidade * valorTorradaSimples );
        }
        else if ( codigo == 5 ) {
            System.out.printf( "Total: R$ %.2f%n", quantidade * valorRefrigerante );
        }
    }
}