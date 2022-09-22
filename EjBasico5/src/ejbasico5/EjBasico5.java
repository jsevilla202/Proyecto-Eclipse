package ejbasico5;
 import java.lang.Math;
import java.util.Scanner;
public class EjBasico5 {

	public static void main(String[] args) {
		//Pedimos al usuario que inserte el radio de la circunferencia
		System.out.print("Introduzca el radio de la circunferencia: ");
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el scanner para dar valor a la variable "radio"
		double radio = sc.nextDouble();
		//Damos valor a la variable "longitud" y "area"
		double longitud = 2*Math.PI*radio;
		double area = Math.PI*(radio*radio);
		//Mostramos por consola los resultados
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
		

	}

}
