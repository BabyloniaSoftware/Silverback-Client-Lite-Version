public class BoltzmannConstant {
    public static void main(String[] args) {
        final double pi = Math.acos(-1); // pi value from Math library
        final double avogadro = Math.exp(Math.log(6.02214129) + Math.log(10) + Math.log(23)); // Avogadro's number
        final double gasConstant = (2 * pi) * ((2 * Math.exp(1)) / avogadro); // gas constant formula
        System.out.println("The Boltzmann constant is: " + (gasConstant / 10000000) + " x 10^-24 J/K"); // print Boltzmann constant
    }
}
