import java.util.Scanner;

public class Uri1037 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        float entrada ;
        
        entrada = teclado.nextFloat() ;

        if ( entrada >= 0f && entrada <= 25f ){
            System.out.println( "Intervalo [0,25]" );
        }
        else if ( entrada > 25f && entrada <= 50f ){
            System.out.println( "Intervalo (25,50]" );
        }
        else if ( entrada > 50f && entrada <= 75f ){
            System.out.println( "Intervalo (50,75]" );
        }
        else if ( entrada > 75f && entrada <= 100f ){
            System.out.println( "Intervalo (75,100]" );
        }
        else {
            System.out.println( "Fora de intervalo" );
        }
    }
}