package ejbasico4;

import java.util.Scanner;

public class EjBasico4 {

	public static void main(String[] args) {
		System.out.println("Cual fue la primera nota?: ");
		Scanner sc = new Scanner(System.in);
		float  nota1 = sc.nextFloat();
		System.out.println("Cual fue la segunda nota?: ");
		float nota2 = sc.nextFloat();
		float notaf = (nota1+nota2)/2;
		System.out.println("Tu media aritmetica es: " + notaf);

	}

}
