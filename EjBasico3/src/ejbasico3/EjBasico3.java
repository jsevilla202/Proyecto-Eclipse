package ejbasico3;

import java.util.Scanner;

public class EjBasico3 {

	public static void main(String[] args) {
		System.out.println("En que año estamos?");
		Scanner sc = new Scanner(System.in);
		int añoa = sc.nextInt();
		System.out.println("En que año nacistes?");
		int añoc = sc.nextInt();
		int añot = añoa-añoc;
		System.out.println("Tienes " + añot + " años");

	}

}
