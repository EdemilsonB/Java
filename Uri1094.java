
import java.util.Scanner;

public class Uri1094 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int qtdeCasos = teclado.nextInt();
        int qtdeCobaias = 0, totalCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
        String tipoCobaia;
        float percentualCoelhos = 0, percentualRatos = 0, percentualSapos = 0;
        
        for ( int i = 1 ; i <= qtdeCasos ; i++ ) {
        	qtdeCobaias = teclado.nextInt();
        	tipoCobaia = teclado.nextLine();
        	totalCobaias += qtdeCobaias;
        	if ( tipoCobaia.equals(" C") ) { totalCoelhos += qtdeCobaias; }
        	else if ( tipoCobaia.equals(" R") ) { totalRatos += qtdeCobaias; }
        	else if ( tipoCobaia.equals(" S") ) { totalSapos += qtdeCobaias; }
        }

        if ( totalCoelhos > 0 ) { percentualCoelhos = ( (float)totalCoelhos / (float)totalCobaias ) * 100; }
        if ( totalRatos > 0 ) { percentualRatos = ( (float)totalRatos / (float)totalCobaias ) * 100; }
        if ( totalSapos > 0 ) { percentualSapos = ( (float)totalSapos / (float)totalCobaias ) * 100; }

        
        System.out.println( "Total: " + totalCobaias + " cobaias" );
        System.out.println( "Total de coelhos: " + totalCoelhos );
        System.out.println( "Total de ratos: " + totalRatos );
        System.out.println( "Total de sapos: " + totalSapos );
        System.out.printf( "Percentual de coelhos: %.2f %%\n", percentualCoelhos );
        System.out.printf( "Percentual de ratos: %.2f %%\n", percentualRatos );
        System.out.printf( "Percentual de sapos: %.2f %%\n", percentualSapos );
        
        teclado.close();
    }
}