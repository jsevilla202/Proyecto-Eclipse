package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			int num1, num2;
			num2 = 6;
			System.out.print("Enter value ");
			num1 = keyboard.nextInt();
			//Al insertar 10 num1 pasa a ser 10 pero se cambia a 10 + 2 = 12
			num1 = num1 + 2;
			//num2 era 6 pero se le cambia la variable a 12 / 6
			num2 = num1 / num2;
			//El resultado es 6
			System.out.println("result = " + num2);
			}


	}

