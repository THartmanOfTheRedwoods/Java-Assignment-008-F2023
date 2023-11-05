//Naqibllah Haiwadpal
//11/4/2023
public class InfiniteSeries {

    public static double myexp(double x, int n) {
        double result = 1;
        double term = 1;

        for (int i = 1; i < n; i++) {
            term *= x / i;
            result += term;
        }

        return result;
    }
    public static void check(double x) {
        int n = 10;
        System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
    }
    public static void main(String[] args) {
        double[] testValues = {0.1, 1.0, 10.0, 100.0, -0.1, -1.0, -10.0, -100.0};
        for (double x : testValues) {
            check(x);
        }
    }
}
