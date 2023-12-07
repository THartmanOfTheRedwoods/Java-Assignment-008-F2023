
public class InfiniteSeries {
/*  Chris Shortt + "tools"
                  12/7/2023
 */
    public static void main(String[] args) {
        double[] valuesToCheck = {0.1, 1.0, 10.0, 100.0};

        System.out.println("For positive values:");
        for (double value : valuesToCheck) {
            check(value);
        }

        double[] negativeValuesToCheck = {-0.1, -1.0, -10.0, -100.0};

        System.out.println("\nFor negative values:");
        for (double value : negativeValuesToCheck) {
            check(value);
        }
    }

    public static double myexp(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i < n; i++) {
            term *= x / i;
            result += term;
        }

        return result;
    }

    public static void check(double x) {
        int n = 20; // Starting value for the number of terms in the series
        double estimatedValue = myexp(x, n);
        double actualValue = Math.exp(x);

        // Vary the number of terms until estimated value agrees with Math.exp(x) when x is 1
        while (Math.abs(estimatedValue - actualValue) > 1e-10) {
            n++;
            estimatedValue = myexp(x, n);
        }

        System.out.printf("%.1f\t%.15f\t%.15f\n", x, estimatedValue, actualValue);
    }
}
