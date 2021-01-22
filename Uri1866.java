import java.util.Scanner;

public class Uri1866 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int casos = teclado.nextInt() ;
        int entrada = 0;
        String msgSaida = "";
        
        for ( int i = 1; i <= casos; i++ ) {
        	entrada = teclado.nextInt();
        	
        	if ( entrada % 2 == 0 ) { msgSaida += "0\n"; }
        	else { msgSaida += "1\n"; }
        }
        
        System.out.print( msgSaida );
        teclado.close();
    }
}