import java.util.Scanner;

public class Uri1017 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int tempoHoras, velocidadeMedia;
        float consumoMedio, litrosGastos;

        consumoMedio = 12; // 12.0 eh o valor dado de 12 Km/l de consumo medio

        tempoHoras = teclado.nextInt();
        velocidadeMedia = teclado.nextInt();
        
        litrosGastos = ( tempoHoras * velocidadeMedia ) / consumoMedio ;

        System.out.printf("%.3f%n", litrosGastos );
    }
}