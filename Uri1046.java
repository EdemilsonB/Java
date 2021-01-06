import java.util.Scanner;

public class Uri1046 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int horaI = 0, horaF = 0 , duracao = 0 ;
        
        horaI = teclado.nextInt() ;
        horaF = teclado.nextInt() ;

        duracao = horaF - horaI ;

        if ( duracao <= 0 ) {
            duracao += 24 ;
        }
        
        System.out.printf( "O JOGO DUROU %d HORA(S)%n", duracao ) ;
    }
}