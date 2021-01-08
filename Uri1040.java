import java.util.Scanner;

public class Uri1040 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float n3 = teclado.nextFloat();
        float n4 = teclado.nextFloat();
        float media = 0;

        media = ( n1 * 2 + n2 * 3 + n3 * 4 + n4 ) / 10;
        System.out.printf( "Media: %.1f\n", media );

        if ( media >= 7.0 ) {
            System.out.println( "Aluno aprovado." );
        }
        else if ( media < 5.0 ) {
            System.out.println( "Aluno reprovado." );
        }
        else {
            System.out.println( "Aluno em exame." );
            
            float nE = teclado.nextFloat();
            System.out.printf( "Nota do exame: %.1f\n", nE );
            media = ( media + nE ) /2;
            
            if ( media >= 5.0 ) {
            	System.out.println( "Aluno aprovado." );
            }
            else {
            	System.out.println( "Aluno reprovado." );
            }
            System.out.printf( "Media final: %.1f\n", media );            
        }
        teclado.close();
    }
}