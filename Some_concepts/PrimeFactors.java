package Some_concepts;

public class PrimeFactors {
    public static void primeFactors(int n) {
        // Handle even numbers
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // Handle remaining odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
    }

    public static void main(String[] args) {
        int n = 343; 
        primeFactors(n);//7 7 7
    }
}
