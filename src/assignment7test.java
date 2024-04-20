/* Jason Yescas
   Object-Oriented Programming : CPSC 24500-001
   4/19/2024
   Assignment 7
   Purpose: To calculate complex numbers */

import java.util.Scanner;

public class assignment7test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first complex number: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		Complex c1 = new Complex(a, b);
		
		System.out.print("Enter the second complex number: ");
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		Complex c2 = new Complex(c, d);
		
		System.out.println(c1 +" + "+ c2 +" = "+ c1.add(c2));
		System.out.println(c1 +" - "+ c2 +" = "+ c1.subtract(c2));
		System.out.println(c1 +" * "+ c2 +" = "+ c1.multiply(c2));
		System.out.println(c1 +" / "+ c2 +" = "+ c1.divide(c2));
		System.out.println("|"+ c1 +"| = "+ c1.abs());
	}
}
