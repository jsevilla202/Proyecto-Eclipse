package exercise4;
//Importamos el scanner
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//creamos un nuevo scanner llamado "keyboard"
		Scanner keyboard = new Scanner(System.in);
		// declare variables
		int x, y;
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		/* Eliminamos esta parte ya que solo hace que se igualen las variables
		x = y;
		y = x;
		*/
		//mostramos los resultados con los cambios entre las variables
		System.out.println("x = " + y);
		System.out.println("y = " + x);

	}

}

/*
a) Las variables se estaban igualando entre ellas
b) Tanto la variable x como la y tendrian el mismo valor que y
c) Arriba está solucionado
*/