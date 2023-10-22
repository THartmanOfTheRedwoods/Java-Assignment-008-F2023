public class InfiniteSeries {


    public static double myExp(double x, int n) {
        double result = 1.0;
        double term = 1.0;
        int i = 1;
        while (i <= n) {
            term = term * x/i;
            result = result + term;
            i++;
        }
        return result;
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n-1);
        return n * recurse;
        }

    public static void check(double x) {
        System.out.println(x + "\t" + Math.exp(x) + "\t" + myExp(x, 13));
    }
    public static void main(String[] args) {
        //The accuracy of the results get worse the larger the value x is.
        //When x = .1 or -.1 the result of myExp method is extremely accurate.
        // but as x gets bigger, the method get gets less useful and more inaccurate.
        //

        double x = 0.1;
        while (x <= 100) {
            check(x);
            x = x * 10;
        }
        x = -0.1;
        while (x >= -100) {
            check(x);
            x= x * 10;
        }

    }
}
