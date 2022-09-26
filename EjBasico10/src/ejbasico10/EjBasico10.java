package ejbasico10;

import java.util.Scanner;

public class EjBasico10 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Damos valor a la variable IVA
		final double IVA = 0.21;
		//Pedimos al usuario que inserte el precio del producto
		System.out.print("Indique el precio del producto: ");
		//Usamos el scanner para dar valor a la variable "precio"
		double precio = sc.nextDouble();
		//Damos valor a la variable "preciot" (precio total)
		double preciot = (precio*IVA)+precio;
		//Mostramos por consola el resultado
		System.out.println("El precio del producto con el IVA incluido es de "+preciot + " euros");
		
	}

}
