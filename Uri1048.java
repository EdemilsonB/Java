import java.util.Scanner;

public class Uri1048 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        float percentual = 0f , salario = 0f , reajuste = 0f , novosalario = 0f ;
        
        salario = teclado.nextFloat() ;

        if ( salario >= 0f && salario <= 400f ) {
            percentual = 0.15f ;
        }
        else if ( salario > 400f && salario <= 800f ) {
            percentual = 0.12f ;
        }
        else if ( salario > 800f && salario <= 1200f ) {
            percentual = 0.10f ;
        }
        else if ( salario > 1200f && salario <= 2000f ) {
            percentual = 0.07f ;
        }
        else if ( salario > 2000f ) {
            percentual = 0.04f ;
        }

        reajuste = salario * percentual ;
        novosalario = salario + reajuste ;

        System.out.printf( "Novo salario: %.2f%n", novosalario ) ;
        System.out.printf( "Reajuste ganho: %.2f%n", reajuste ) ;
        System.out.printf( "Em percentual: %.0f %%%n", percentual * 100 ) ;

    }
}