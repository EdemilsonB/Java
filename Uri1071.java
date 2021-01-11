
import java.util.Scanner;

public class Uri1071 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int entradaX = teclado.nextInt();
        int entradaY = teclado.nextInt();
        int soma = 0, menor, maior;
        
        if ( entradaX > entradaY ) {
        	maior = entradaX;
        	menor = entradaY;
        }
        else {
        	maior = entradaY;
        	menor = entradaX;
        }
        
        if ( menor % 2 == 0 ) { menor++; }
        else { menor += 2;}        
        
        for ( int i = menor; i < maior; i += 2 ) {
        	soma += i;
        }
        
        System.out.println( soma );
        teclado.close();
    }
}
