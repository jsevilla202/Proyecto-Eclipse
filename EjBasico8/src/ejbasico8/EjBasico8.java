package ejbasico8;

import java.util.Scanner;

public class EjBasico8 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte su nombre
		System.out.print("Inserte su nombre: ");
		//Usamos el scanner para dar valor a la variable "nombre"
		String nombre = sc.nextLine();
		//Pedimos al usuario que inserte su edad
		System.out.print("Intruduzca su edad: ");
		//Usamos el scanner para dar valor a la variable "edad"
		int edad = sc.nextInt();
		//Mostramos por consola el resultado
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
	}

}
