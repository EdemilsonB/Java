import java.util.Scanner;

public class Uri1049 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String entradaA = "", entradaB = "", entradaC = "";
		
		entradaA = teclado.nextLine();
		entradaB = teclado.nextLine();
		entradaC = teclado.nextLine();
		
		switch ( entradaA ) {
			case "vertebrado":
				switch ( entradaB ) {
				case "ave":
					switch ( entradaC ) {
					case "carnivoro":
						System.out.println("aguia");
						break;
					case "onivoro":
						System.out.println("pomba");
						break;
					}
				break;
				case "mamifero":
					switch ( entradaC ) {
					case "onivoro":
						System.out.println("homem");
						break;
					case "herbivoro":
						System.out.println("vaca");
						break;
					}
					break;
				}
				break;
			case "invertebrado":
				switch ( entradaB ) {
				case "inseto":
					switch ( entradaC ) {
					case "hematofago":
						System.out.println("pulga");
						break;
					case "herbivoro":
						System.out.println("lagarta");
						break;
					}
					break;
				case "anelideo":
					switch ( entradaC ) {
					case "hematofago":
						System.out.println("sanguessuga");
						break;
					case "onivoro":
						System.out.println("minhoca");
						break;
					}
					break;
				}
				break;
		}
		
		teclado.close();
	}
}
