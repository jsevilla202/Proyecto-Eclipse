package ejbasico5;
 import java.lang.Math;
import java.util.Scanner;
public class EjBasico5 {

	public static void main(String[] args) {
		System.out.println("Introduzca el radio de la circunferencia: ");
		Scanner sc = new Scanner(System.in);
		double radio = sc.nextDouble();
		double longitud = 2*Math.PI*radio;
		double area = Math.PI*(radio*radio);
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
		

	}

}
