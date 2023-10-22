public class InfiniteSeries {

    // A method that estimates e^x by adding the first n terms of the series
    public static double myexp(double x, int n) {
        double sum = 1.0; // The first term is 1
        double term = 1.0; // The current term
        for (int i = 1; i < n; i++) {
            term = term * x / i; // The next term is the previous term multiplied by x and divided by i
            sum = sum + term; // Add the term to the sum
        }
        return sum;
    }

    // A method that displays x, myexp(x, n), and Math.exp(x)
    public static void check(double x, int n) {
        System.out.printf("%f\t%f\t%f\n", x, myexp(x, n), Math.exp(x));
    }

    public static void main(String[] args) {
        // Vary the number of terms in the series
        int n = 10; // You can adjust this value until the estimated value agrees with the correct answer when x is 1

        // Check with the values 0.1, 1.0, 10.0, and 100.0
        check(0.1, n);
        check(1.0, n);
        check(10.0, n);
        check(100.0, n);

        // Check with the values -0.1, -1.0, -10.0, and -100.0
        check(-0.1, n);
        check(-1.0, n);
        check(-10.0, n);
        check(-100.0, n);
    }
}
