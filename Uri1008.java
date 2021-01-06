import java.util.Scanner;

public class Uri1008 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        
        int funcionario;
        int horasTrabalhadas;
        float valorHoraTrabalhada;

        float salario;
        
        funcionario = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHoraTrabalhada = teclado.nextFloat();
        
        salario = horasTrabalhadas * valorHoraTrabalhada;
        
        System.out.println("NUMBER = " + funcionario );
        System.out.printf("SALARY = U$ %.2f%n", salario );
    }
}