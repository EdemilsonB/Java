import java.util.Scanner;

public class Uri1019 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int eventoEmSegundos, restos, horas, minutos, segundos;

        eventoEmSegundos = teclado.nextInt();
        
        horas = eventoEmSegundos / 3600;
        restos = eventoEmSegundos % 3600;

        minutos = restos / 60;
        segundos = restos % 60;
        
        System.out.println( horas + ":" + minutos + ":" + segundos );
    }
}