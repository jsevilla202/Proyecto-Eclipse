package ejbasico9;

import java.util.Scanner;

public class EjBasico9 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca la cantidad de pesetas
		System.out.print("Introduzca la cantidad de pesetas: ");
		//Buscamos el numero de pesetas introducido por el usuario
		int pesetas = sc.nextInt();
		//Creamos la variable euros y le damos el valor de la ecuación
		double euros = pesetas*0.006;
		//Mostramos la conversión por consola
		System.out.println("Tienes un total de: " + euros + " euros");

	}

}
