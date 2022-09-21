package ejbasico10;

import java.util.Scanner;

public class EjBasico10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double IVA = 0.21;
		System.out.print("Indique el precio del producto: ");
		double precio = sc.nextDouble();
		double preciot = (precio*IVA)+precio;
		System.out.println("El precio del producto con el IVA incluido es de "+preciot + " euros");
		
	}

}
