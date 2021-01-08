import java.util.Scanner;

public class Uri1042 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int p = 0, s = 0, t = 0;
		
		if ( a == b || a > b ) {
			p = a;
			s = b;
		}
		else {
			p = b;
			s = a;
		}
		
		if ( c == p || c > p ) {
			t = s;
			s = p;
			p = c;
		}
		else if ( c == s || c > s ) {
			t = s;
			s = c;
		}
		else {
			t = c;
		}
				
		System.out.println( t );
		System.out.println( s );
		System.out.println( p );
		System.out.println(   );
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		
		teclado.close();
	}
}
