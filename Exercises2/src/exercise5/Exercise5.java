package exercise5;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lenght, height;
		System.out.print("Inserte un valor para la longitud: ");
		lenght = sc.nextDouble();
		System.out.print("Inserte un valor para la anchura: ");
		height = sc.nextDouble();
		double perimeter = 2*lenght+2*height;
		double area = lenght*height;
		System.out.println("El area es " + area);
		System.out.print("El perímetro es: " + perimeter);

	}

}
