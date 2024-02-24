package OOPS_PracticeQ;
// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.

public class Ques6 {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(2, 2);

        System.out.println("Sum: " + c1.add(c2));//toString method Automatically invoke when we want to print objects
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));
    }
}
class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    // Using Copy Constructor Concept
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    // Using Copy Constructor Concept

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }
    // Using Copy Constructor Concept 
    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real - this.imag * other.imag, this.real * other.imag + this.imag * other.real);
    }

    // The toString() method in Java is invoked automatically when an object needs to be represented as a string.
    @Override
    public String toString() {
        return "Complex{real=" +real+", imag="+imag+"}";
    }
}
