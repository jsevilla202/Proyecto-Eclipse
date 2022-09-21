package ejbasico8;

import java.util.Scanner;

public class EjBasico8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserte su nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Intruduzca su edad: ");
		int edad = sc.nextInt();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
	}

}
