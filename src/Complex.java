/* Jason Yescas
   Object-Oriented Programming : CPSC 24500-001
   4/19/2024
   Assignment 7
   Purpose: To calculate complex numbers */

public class Complex implements Comparable<Complex> {
	private double real; // Real part of complex number
	private double imag; // Imaginary part of complex number
	
	/**
	 * Makes a new complex number
	 * @param real The real part
	 * @param imag The imaginary part
	 */
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	/**
	 * Makes a new complex number with real part and zero imaginary
	 * @param real
	 */
	public Complex(double real) {
		this(real, 0);
	}
	
	/**
	 * Makes a zero complex number (0 + 0i)
	 */
	public Complex() {
		this(0, 0);
	}
	
	/**
	 * Copy constructor that makes a copy of the original complex number
	 * @param complexNum
	 */
	public Complex(Complex complexNum) {
		this(complexNum.real, complexNum.imag);
	}
	
	/**
	 * Returns the real part of complex number
	 * @return
	 */
	public double getRealPart() {
		return real;
	}
	
	/**
	 * Returns the imaginary part of complex number
	 * @return
	 */
	public double getImagPart() {
		return imag;
	}
	
	/**
	 * Adds this complex numbers to other complex numbers
	 * @param other The other complex number to add
	 * @return The sum
	 */
	public Complex add(Complex other) {
		return new Complex(this.real + other.real, this.imag + other.imag);
	}
	
	/**
	 * Subtracts other complex number from this complex number
	 * @param other The other complex number to subtract
	 * @return The difference
	 */
	public Complex subtract(Complex other) {
		return new Complex(this.real - other.real, this.imag - other.imag);
	}
	
	/**
	 * Multiplies this complex number by other complex number
	 * @param other The other complex number to multiply
	 * @return The product
	 */
	public Complex multiply(Complex other) {
		double newReal = this.real * other.real - this.imag * other.imag;
		double newImag = this.imag * other.real + this.real * other.imag;
		return new Complex(newReal, newImag);
	}
	
	/**
	 * Divides this complex number by other complex number
	 * @param other The other complex number to divide by
	 * @return The quotient
	 */
	public Complex divide(Complex other) {
		double denom = other.real * other.real + other.imag * other.imag;
		double newReal = (this.real * other.real + this.imag * other.imag) / denom;
		double newImag = (this.imag * other.real - this.real * other.imag) / denom;
		return new Complex(newReal, newImag);
	}
	
	/**
	 * Calculates the absolute value of this complex number
	 * @return The absolute value
	 */
	public double abs() {
		return Math.sqrt(real * real + imag * imag);
	}
	
	@Override
	public String toString() {
		if (imag == 0) return String.valueOf(real);
		return "("+ real +" + "+ imag +"i)";
	}
	
	@Override
	public int compareTo(Complex other) {
		return Double.compare(this.abs(), other.abs());
	}
}