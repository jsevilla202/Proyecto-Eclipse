package ejbasico9;

import java.util.Scanner;

public class EjBasico9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de pesetas: ");
		int pesetas = sc.nextInt();
		double euros = pesetas*0.006;
		System.out.println("Tienes un total de: " + euros + " euros");

	}

}
