import java.util.Scanner;

public class Uri1009 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        String vendedor = "" ;
        double salario, vendas, comissao, salarioTotal;
        
        vendedor = teclado.nextLine() ;
        salario = teclado.nextDouble() ;
        vendas = teclado.nextDouble() ;

        comissao = vendas * 0.15 ;
        salarioTotal = salario + comissao ;

        System.out.printf( "TOTAL = R$ %.2f%n", salarioTotal ) ;
    }
}