import java.util.Scanner;

public class Uri1014 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int distancia;
        float consumo;
        float mediaConsumo;
        
        distancia = teclado.nextInt();
        consumo = teclado.nextFloat();

        mediaConsumo = distancia / consumo;
        
        System.out.printf("%.3f km/l%n", mediaConsumo );
    }
}