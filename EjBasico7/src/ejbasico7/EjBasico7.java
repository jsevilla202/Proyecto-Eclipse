package ejbasico7;

import java.util.Scanner;

public class EjBasico7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Intruduzca su calle: ");
		String calle = sc.nextLine();
		System.out.println("Intruduzca su numero: ");
		int numero = sc.nextInt();
		System.out.println("Nombre: " + nombre);
		System.out.println("Calle: " + calle);
		System.out.println("Numero: " + numero);

	}

}
