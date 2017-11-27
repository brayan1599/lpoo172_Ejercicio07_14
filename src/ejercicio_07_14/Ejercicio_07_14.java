/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_14;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
		int[] numeros = new int[5]; // Create an array of length 5
		
		// Prompt the user to enter five numbers
		System.out.print("Ingrese cinco numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}

		// Display the gcd
		System.out.println("El mayor divisor común es " + gcd(numeros));
	}

	/** Method gcd returns the gcd of an unspecified number of integers */
	public static int gcd(int... numeros) {
		int gcd = 1;			// Initial gcd is 1
		boolean isDivisor;	// Is number a diviser

		for (int i = 2; i < min(numeros); i++) {
			isDivisor = true;
			for (int e: numeros) {
				if (e % i != 0)
					isDivisor = false;
			}
			if (isDivisor)
				gcd = i;
		}
		return gcd;
	}

	/** Method min returns the smallest integer in an array */
	public static int min(int... numeros) {
		int min = numeros[0];
		for (int e: numeros) {
			if (e < min)
				min = e;
		}
		return min;
	}
}