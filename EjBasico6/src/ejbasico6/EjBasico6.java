package ejbasico6;

import java.util.Scanner;

public class EjBasico6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intruduzca un numero: ");
		double numero1 = sc.nextDouble();
		System.out.println("Intruduzca otro numero: ");
		double numero2 = sc.nextDouble();
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double multi = numero1 * numero2;
		double divi = numero1 / numero2;
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("La multiplicacion de los numeros es: "+multi);
		System.out.println("La division de los numeros es: "+divi);

	}

}
