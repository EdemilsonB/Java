import java.util.Scanner;

public class Uri1864 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int chars = teclado.nextInt() ;
        String texto = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        
        System.out.println(texto.substring(0, chars));
        teclado.close();
    }
}