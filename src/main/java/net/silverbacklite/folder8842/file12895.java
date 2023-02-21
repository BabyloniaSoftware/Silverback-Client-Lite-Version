public class SquareRootOfTwo {
    public static void main(String[] args) {
        double n = 2; // number to calculate square root
        double x = n; // initial guess for square root

        // loop until the guess is accurate enough
        while (Math.abs(x * x - n) > 0.000001) {
            x = 0.5 * (x + n / x); // use the Babylonian method to improve the guess
        }

        System.out.println("The square root of " + n + " is approximately " + x);
    }
    // This program approximates the square root of 2 without using any built-in square root or exponent functions.
    // It uses the Babylonian method to iteratively improve a guess for the square root until it is accurate enough.
}
