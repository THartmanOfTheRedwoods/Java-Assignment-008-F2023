//Naqibllah Haiwadpal
//11/4/2023
public class InfiniteSeries {

    // Method to calculate e^x using an infinite series expansion
    public static double myexp(double x, int n) {
        double result = 1; // start with the 0th term
        double term = 1; // the ith term, starting with 1 for i=0

        for (int i = 1; i < n; i++) {
            term *= x / i; // calculate the next term
            result += term; // add the term to the result
        }

        return result;
    }

    // Method to check the result of myexp against Math.exp
    public static void check(double x) {
        int n = 10; // adjust n for better accuracy, depending on the magnitude of x
        System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
    }

    public static void main(String[] args) {
        // Check positive values
        double[] testValues = {0.1, 1.0, 10.0, 100.0, -0.1, -1.0, -10.0, -100.0};
        for (double x : testValues) {
            check(x);
        }
    }
}
