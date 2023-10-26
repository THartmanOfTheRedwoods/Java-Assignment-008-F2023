import java.util.Scanner;

public class InfiniteSeries {

    private static double result = 1;
    private static int exponent;
    private static int iterations;
    private static final Scanner s = new Scanner(System.in);

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
        double expVal = 1;
        if (x == 0 && n == 0) {
            System.out.println("Knuth and Benson are coming for you.");
        } else if (x != 0 && n == 0) {
            System.out.println(expVal);
        } else {
            for (int i = 1; i <= n; i++){
                result *= x;
                result /= i;
                expVal += result;
            }
            System.out.println(expVal);
        }
    }



    /**
     * Calls getUserVals method, then passes resulting instance values to myexp method
     * @author Atticus Blanco
     */
    public static void main (String[] args){
        getUserVals();
        myexp(exponent, iterations);
    }
}