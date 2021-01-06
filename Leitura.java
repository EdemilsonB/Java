/* 
    Para fazer leitura do teclado, precisamos de um componente Scanner que está disponível no pacote UTIL da linguagem Java
*/
import java.util.Scanner;

public class Leitura {
    public static void main ( String args[] ) {

        // passo 1 - declarar um componente (uma variável) do tipo Scanner
        Scanner teclado;

        // passo 2 - indicar que o scanner vai ler do teclado
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.println( "Por favor digite um valor inteiro" );
        a = teclado.nextInt();

        System.out.println( "Por favor digite um valor real" );
        b = teclado.nextDouble();

        System.out.println( "Voce digitou os valores " + a + " e " + b );
    }
}