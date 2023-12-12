/**
 *
 * @author Angelina Perez
 * @author Trevor Hartman
 *
 * @since Version 1.0
 *
 */
public class InfiniteSeries {
    public static double myexp(double x, int n) {
        double result = 1.0;
        double numerator = 1.0;
        double denominator = 1.0;
        for (int i = 1; i <= n; i++) {
            numerator = numerator * x;
            denominator = denominator * i;
            result = result + numerator / denominator;
        }
        return result;

    }

    public static void check(double x) {
        System.out.print(x + "\t" + myexp(x, 20) + "\t" + Math.exp(x) + "\n");
    }




    public static void main(String[] args) {
        for (double x = -0.1; x>= -100.0; x *= 10) {
            check(x);
        }
        for (double x = 0.1; x <= 100.0; x *= 10) {
            check(x);
        }

    }
}
