import java.util.Scanner;

public class Uri1050 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int DDD ;

        // literais
        int BRASILIA = 61, SALVADOR = 71, SAOPAULO = 11, RIODEJANEIRO = 21, JUIZDEFORA = 32, CAMPINAS = 19, VITORIA = 27, BELOHORIZONTE = 31 ;
        
        DDD = teclado.nextInt() ;

        if ( DDD == BRASILIA ) {
            System.out.println( "Brasilia" );
        }
        else if ( DDD == SALVADOR ) {
            System.out.println( "Salvador" );
        }
        else if ( DDD == SALVADOR ) {
            System.out.println( "Salvador" );
        }
        else if ( DDD == SAOPAULO ) {
            System.out.println( "Sao Paulo" );
        }
        else if ( DDD == RIODEJANEIRO ) {
            System.out.println( "Rio de Janeiro" );
        }
        else if ( DDD == JUIZDEFORA ) {
            System.out.println( "Juiz de Fora" );
        }
        else if ( DDD == CAMPINAS ) {
            System.out.println( "Campinas" );
        }
        else if ( DDD == VITORIA ) {
            System.out.println( "Vitoria" );
        }
        else if ( DDD == BELOHORIZONTE ) {
            System.out.println( "Belo Horizonte" );
        }
        else {
            System.out.println( "DDD nao cadastrado" );
        }
    }
}