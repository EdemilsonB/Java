import java.util.Scanner;

public class Uri1114 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int senhaInformada = 0, senhaCorreta = 2002 ;
        
        while ( senhaInformada != senhaCorreta ) {
            senhaInformada = teclado.nextInt() ;
            if ( senhaInformada != senhaCorreta ) {
                System.out.println( "Senha Invalida" ) ;
            }
        }
        System.out.println( "Acesso Permitido" ) ;
    }
}