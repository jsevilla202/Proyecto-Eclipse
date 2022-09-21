package ejbasico2;

import java.util.Scanner;

public class EjBasico2 {

	public static void main(String[] args) {
		System.out.println("Inserte su edad: ");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		int edad2 = edad + 1;
		System.out.println("El año que viene tendra " + edad2 + " años");

	}

}
