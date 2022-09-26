package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//No se importó el scanner
		Scanner keyboard = new Scanner(System.in);
		//YEAR no está definido
		int YEAR = 2022;
		int age, bornIn;
		//Faltan las comillas
		System.out.print("How old are you this year? ");
		//La edad no puede tener digitos, cambiamos double por int
		age = keyboard.nextInt();
		bornIn = YEAR - age;
		//BornIn no es la misma variable que bornIn
		System.out.println("I think you were born in " + bornIn);
		}


	}
