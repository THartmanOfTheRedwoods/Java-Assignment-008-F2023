import java.util.stream.LongStream;

public class InfiniteSeries {

    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public static double myexp(double x, int n) {
        double s = 1.0;
        double t = 1.0;
        for(int i=1; i<n; i++) {
            t *= x / i;
            s += t;
        }
        return s;
    }

    public static void check(double x, int n) {
        double est = myexp(x, n);
        double act = Math.exp(x);
        System.out.printf("%.1f\t%.15f\t%.15f\n", x, est, act);
    }




    public static void main(String[] args) {
        System.out.println("x\tmyexp(x)\tMath.exp(x)");


        for (double x : new double[]{0.1, 1.0, 10.0, 100.0}) {
            for (int n = 1; n <= 20; n++) {
                check(x, n);
            }
            System.out.println("------------------------------------");
        }

        // Check with negative values of x
        for (double x : new double[]{-0.1, -1.0, -10.0, -100.0}) {
            for (int n = 1; n <= 20; n++) {
                check(x, n);
            }
            System.out.println("------------------------------------");
        }
    }
}
