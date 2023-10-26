import java.util.Scanner;

public class InfiniteSeries {

    private static double expVal = 1;
    private static int exponent;
    private static int iterations;
    private static final Scanner s = new Scanner(System.in);
    private static final String template = "%-10s %-20s%-20s%n";

    /**
     * Prompts user for int value
     * @author Atticus Blanco
     */
    private static void getUserVals(){
        System.out.println("Select an integer exponent: ");
        exponent = Integer.parseInt(s.nextLine());
        System.out.println("Select number of iterations: ");
        iterations = Integer.parseInt(s.nextLine());
    }

    /**
     * Calculates the infinite summation e^x. An exponent parameter x, and an iterative limit parameter n is passed. e^x is approximated at the parameter x with n iterative summation terms.
     * @author Atticus Blanco
     * @param x: exponent value
     * @param n: number summation terms
     */
    private static void myexp(int x, int n) {
        double result = 1;
        if (x == 0 && n == 0) {
            System.out.println("Knuth and Benson are coming for you.");
        } else if (x != 0 && n == 0) {
            System.out.println(expVal);
        } else {
            for (int i = 1; i <= n; i++){       //Accuracy maxes out at 17 iterations.
                result *= x;
                result /= i;
                expVal += result;
            }
            System.out.println(expVal);
        }
    }

    /**
     * Prints the exponent, and compares the method-calculated value of e^x with the package value of e^x
     * @author Atticus Blanco
     * @param exponent: instance variable
     */
    private static void check(int exponent) {
        System.out.printf(template, "Exponent", "Calculated Value", "Package Value");
        System.out.printf(template , exponent, expVal, Math.exp(exponent));
    }

    /**
     * Calls getUserVals method, Calls myexp method and passes instance variables exponent and iterations, calles check method and passes instance variable exponent
     * @author Atticus Blanco
     */
    public static void main (String[] args){
        getUserVals();
        myexp(exponent, iterations);
        check(exponent);
    }
}