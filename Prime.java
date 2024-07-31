public class Prime {
    public static void main(String[] args) {
        int count = 0; // Counter for number of primes found
        int number = 2; // Starting number to check for primality

        System.out.println("The first 10 prime numbers are:");

        while (count < 10) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is prime
    }
}
