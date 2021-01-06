import java.util.Scanner;

public class Uri1047 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int horaI = 0, minI = 0, totalMinI = 0, horaF = 0 , minF = 0, totalMinF = 0, duracaoMin = 0 ;
        
        horaI = teclado.nextInt() ;
        minI = teclado.nextInt() ;
        horaF = teclado.nextInt() ;
        minF = teclado.nextInt() ;

        totalMinI = horaI * 60 + minI ;
        totalMinF = horaF * 60 + minF ;

        duracaoMin = totalMinF - totalMinI ;

        if ( duracaoMin <= 0 ) {
            duracaoMin += 24 * 60 ;
        }
               
        System.out.printf( "O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoMin / 60 , duracaoMin % 60 ) ;
    }
}