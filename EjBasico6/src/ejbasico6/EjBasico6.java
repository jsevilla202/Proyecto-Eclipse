package ejbasico6;

import java.util.Scanner;

public class EjBasico6 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte un numero
		System.out.print("Intruduzca un numero: ");
		//Usamos el scanner para dar valor a la variable "numero1"
		double numero1 = sc.nextDouble();
		//Pedimos al usuario que inserte otro numero
		System.out.print("Intruduzca otro numero: ");
		//Usamos el scanner para dar valor a la variable "numero2"
		double numero2 = sc.nextDouble();
		//Damos valores a las variables "suma", "resta", "multi" y "divi"
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double multi = numero1 * numero2;
		double divi = numero1 / numero2;
		//Mostramos por consola los resultado
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("La multiplicacion de los numeros es: "+multi);
		System.out.println("La division de los numeros es: "+divi);

	}

}
