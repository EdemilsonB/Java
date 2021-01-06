import java.util.Scanner;

public class Uri1002 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        double area, pi, raio;
        pi = 3.14159;
        
        raio = teclado.nextDouble();

        area = pi * raio * raio ;

        System.out.printf( "A=%.4f%n", area );
    }
}