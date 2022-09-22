package ejbasico7;

import java.util.Scanner;

public class EjBasico7 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte su nombre
		System.out.print("Inserte su nombre: ");
		//Usamos el scanner para dar valor a la variable "nombre"
		String nombre = sc.nextLine();
		//Pedimos al usuario que inserte su calle
		System.out.print("Intruduzca su calle: ");
		//Usamos el scanner para dar valor a la variable "calle"
		String calle = sc.nextLine();
		//Pedimos al usuario que inserte su numero
		System.out.print("Intruduzca su numero: ");
		//Usamos el scanner para dar valor a la variable "numero"
		int numero = sc.nextInt();
		//Mostramos por consola el resultado
		System.out.println("Nombre: " + nombre);
		System.out.println("Calle: " + calle);
		System.out.println("Numero: " + numero);

	}

}
