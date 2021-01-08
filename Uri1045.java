import java.util.Scanner;

public class Uri1045 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double entradaA = teclado.nextDouble();
		double entradaB = teclado.nextDouble();
		double entradaC = teclado.nextDouble();
		double a = 0.0, b = 0.0, c = 0.0;

		// ordenar medidas
		if (entradaA == entradaB || entradaA > entradaB) {
			a = entradaA;
			b = entradaB;
		} else {
			a = entradaB;
			b = entradaA;
		}

		if (entradaC == a || entradaC > a) {
			c = b;
			b = a;
			a = entradaC;
		} else if (entradaC == b || entradaC > b) {
			c = b;
			b = entradaC;
		} else {
			c = entradaC;
		}

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			// quadrados
			double a2 = 0.0, b2 = 0.0, c2 = 0.0;
			a2 = a * a;
			b2 = b * b;
			c2 = c * c;
			
			// tipos de triangulos possiveis com as medidas dadas
			if (a2 == (b2 + c2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (a2 > (b2 + c2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (a2 < (b2 + c2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((a == b && b != c) || (b == c && b != a) || (a == c && a != b)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		teclado.close();
	}
}