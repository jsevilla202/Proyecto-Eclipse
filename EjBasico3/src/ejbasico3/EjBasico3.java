package ejbasico3;

import java.util.Scanner;

public class EjBasico3 {

	public static void main(String[] args) {
		//Pedimos al usuario que inserte el año actual
		System.out.print("En que año estamos? ");
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el scanner para dar valor a la variable "añoa" (año actual)
		int añoa = sc.nextInt();
		//Pedimos al usuario que inserte su año de nacimiento
		System.out.print("En que año nacistes? ");
		//Usamos el scanner para dar valor a la variable "añon" (año nacimiento)
		int añon = sc.nextInt();
		//Damos valor a la variable "añot" (año total)
		int añot = añoa-añon;
		//Mostramos por consola el resultado
		System.out.println("Tienes " + añot + " años");

	}

}
