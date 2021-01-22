import java.util.Scanner;

public class Uri1865 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int casos = teclado.nextInt() ;
        String desafiador, newtons, msgSaida = "";
        
        for ( int i = 1; i <= casos; i++ ) {
        	desafiador = teclado.next();
        	newtons = teclado.next();
        	
        	if ( desafiador.equals("Thor") ) { msgSaida += "Y\n"; }
        	else { msgSaida += "N\n"; }
        }
        
        System.out.print( msgSaida );
        teclado.close();
    }
}