public class InfiniteSeries {

    // A method that estimates e^x by adding the first n terms of the series
    public static double myexp(double x, int n) {
        double sum = 1.0; // The first term is always 1
        double numerator = 1.0; // The numerator of the current term
        double denominator = 1.0; // The denominator of the current term
        for (int i = 1; i < n; i++) {
            numerator = numerator * x; // The numerator is the previous one multiplied by x
            denominator = denominator * i; // The denominator is the previous one multiplied by i
            sum = sum + numerator / denominator; // Add the current term to the sum
        }
        return sum;
    }

    // A method that displays x, myexp(x), and Math.exp(x)
    public static void check(double x) {
        System.out.printf("%f\t%f\t%f\n", x, myexp(x, 10), Math.exp(x)); // Use format specifiers to print the values in columns
    }

    public static void main(String[] args) {
        // A loop that invokes check with the values 0.1, 1.0, 10.0, and 100.0
        for (double x = 0.1; x <= 100.0; x = x * 10) {
            check(x);
        }
        // A loop that invokes check with the values -0.1, -1.0, -10.0, and -100.0
        for (double x = -0.1; x >= -100.0; x = x * 10) {
            check(x);
        }
        // A comment on the accuracy of the result
        /*
         * The accuracy of the result depends on the value of x and the number of terms in the series.
         * When x is close to zero, the result is more accurate because the terms are smaller and converge faster.
         * When x is large or negative, the result is less accurate because the terms are larger and oscillate more.
         * To improve the accuracy, we can increase the number of terms in the series until the difference between myexp(x) and Math.exp(x) is negligible.
         */
    }
}

