package testscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println("Ha escrito " + numero);
		sc.close();
	}

}
