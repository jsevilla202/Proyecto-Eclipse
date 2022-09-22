package ejbasico1;

import java.util.Scanner;

public class EjBasico1 {

	public static void main(String[] args) {
		//Pedimos al usuario que inserte un numero
		System.out.print("Inserte un número: ");
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el scanner para dar valor a la variable "numero"
		double numero = sc.nextDouble();
		//Mostramos por consola el resultado
		System.out.println("Ha escrito " + numero);
		sc.close();
	}

}
