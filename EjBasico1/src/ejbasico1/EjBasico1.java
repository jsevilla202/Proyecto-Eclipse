package ejbasico1;

import java.util.Scanner;

public class EjBasico1 {

	public static void main(String[] args) {
		System.out.println("Inserte un número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println("Ha escrito " + numero);
		sc.close();
	}

}
