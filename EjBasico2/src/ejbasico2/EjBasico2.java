package ejbasico2;

import java.util.Scanner;

public class EjBasico2 {

	public static void main(String[] args) {
		//Pedimos al usuario que inserte su edad
		System.out.print("Inserte su edad: ");
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el scanner para dar valor a la variable "edad"
		int edad = sc.nextInt();
		//Damos valor a la variable "edadt" (edad total)
		int edadt = edad + 1;
		//Mostramos por consola el resultado
		System.out.println("El año que viene tendra " + edadt + " años");

	}

}
