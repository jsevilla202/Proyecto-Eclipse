package ejbasico4;

import java.util.Scanner;

public class EjBasico4 {

	public static void main(String[] args) {
		//Pedimos al usuario que inserte su primera nota
		System.out.print("Cual fue la primera nota?: ");
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el scanner para dar valor a la variable "nota1"
		float  nota1 = sc.nextFloat();
		//Pedimos al usuario que inserte su segunda nota
		System.out.print("Cual fue la segunda nota?: ");
		//Usamos el scanner para dar valor a la variable "nota2"
		float nota2 = sc.nextFloat();
		//Damos valor a la variable "notaf"
		float notaf = (nota1+nota2)/2;
		//Mostramos por consola el resultado
		System.out.println("Su media aritmetica es: " + notaf);

	}

}
