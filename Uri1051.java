import java.util.Scanner;

public class Uri1051 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        double salario = 0, faixa = 0, imposto = 0 ;
        
        salario = teclado.nextDouble() ;

        if ( salario <= 2000 ) {
            System.out.println( "Isento" ) ;
        }
        else {
            if ( salario > 2000 ) { 
                if ( salario > 3000) { faixa = 1000 ; }
                else { faixa = salario - 2000 ; }
                imposto += faixa * 0.08 ;
            }
            if ( salario > 3000 ) {
                if ( salario > 4500 ) { faixa = 1500 ; }
                else { faixa = salario - 3000 ; }
                imposto += faixa * 0.18 ;
            }
            if ( salario > 4500 ) {
                faixa = salario - 4500 ;
                imposto += faixa * 0.28 ;
            }
            System.out.printf( "R$ %.2f%n" , imposto ) ;
        }
    }
}