public class InfiniteSeries {

    // Part 1: Calculattion using what the book says
    public static double myexp(double x, int n) {
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            result += Math.pow(x, i) / factorial(i);
        }

        return result;
    }

    // Part 2:  more efficient way from google
    public static double myexpEfficient(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            result += term;
        }

        return result;
    }

    // factorial method
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    // Part 3: Displays x and myexp(x) and Math.exp(x)
    public static void check(double x, int n) {
        double myexpResult = myexpEfficient(x, n);
        double mathExpResult = Math.exp(x);
        System.out.println(x + "\t" + myexpResult + "\t" + mathExpResult);
    }

    public static void main(String[] args) {
        // Part 4: Vary the number of terms and check accuracy for x = 1.0
        double x = 1.0;
        for (int n = 1; n <= 10; n++) {
            check(x, n);
        }

        // Part 5: Loop to check values for different x
        double[] xValues = {0.1, 1.0, 10.0, 100.0};
        for (double val : xValues) {
            check(val, 10);
        }

        // Part 6: Loop to check values for negative x
        for (double val : xValues) {
            check(-val, 10);
        }
    }
}
//its not the most accurate but its close