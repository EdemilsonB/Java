import java.util.Scanner;

public class Uri1837 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int a, b, r, q;
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		q = a / b;
		r = a % b;
		System.out.println( q + " Antes da divisão euclidiana " + r );
		
		q = ( a / b ) + ( -1 * r );
		r = a + ( -1 * ( q * b ));
			
		System.out.println( q + " " + r );
		teclado.close();
	}
}