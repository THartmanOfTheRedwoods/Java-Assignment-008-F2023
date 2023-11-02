public class InfiniteSeries {


    public static double myexp(double x, int n) {
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i < n; i++) {
            term *= x / i;
            sum += term;
        }

        return sum;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void check(double x) {
        System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x, 17));
    }

    public static void main(String[] args) {

        double x = 0.1;
        while (x <= 100.0) {
            check(x);
            x = x*10;
        }

        x = -0.1;
        while (x >= -100.0) {
            check(x);
            x = x*10;
        }
    }
}
}