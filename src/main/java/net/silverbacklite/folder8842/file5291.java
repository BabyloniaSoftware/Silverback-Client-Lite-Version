import java.math.BigDecimal;
import java.math.MathContext;

public class PiCalculator {
    public static void main(String[] args) {
        BigDecimal pi = calculatePi(100);
        System.out.println(pi);
    }

    public static BigDecimal calculatePi(int precision) {
        int scale = precision + 5;
        BigDecimal pi = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");

        // Use Newton's method to improve the accuracy of pi
        for (int i = 0; i < 10; i++) {
            BigDecimal x = pi.divide(new BigDecimal("2"), scale, BigDecimal.ROUND_HALF_UP);
            pi = pi.add(x.multiply(x).multiply(new BigDecimal("4")).subtract(new BigDecimal("2")).multiply(x))
                    .round(new MathContext(scale, BigDecimal.ROUND_HALF_UP));
        }

        return pi.setScale(precision, BigDecimal.ROUND_HALF_UP);
    }
}
