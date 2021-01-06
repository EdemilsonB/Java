import java.util.Scanner;

public class Uri1010 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        float valorPeca1, valorPeca2;

        float valorAPagar;
        
        codigoPeca1 = teclado.nextInt();
        quantidadePeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextFloat();

        codigoPeca2 = teclado.nextInt();
        quantidadePeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextFloat();
        
        valorAPagar = ( quantidadePeca1 * valorPeca1 ) + ( quantidadePeca2 * valorPeca2 );

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar );
    }
}