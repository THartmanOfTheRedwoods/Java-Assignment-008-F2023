import java.util.Scanner;
public class InfiniteSeries {
    static Scanner scan = new Scanner(System.in);
// x = exponent
// n = number of x^i/i1 in series, length of series
// i = current number of terms
// e^x = 1 + x + x^i/i! + ...
    public static double myexp () {
        System.out.println("Enter your x value: ");
        double x = Double.parseDouble(scan.nextLine());
        System.out.println("Enter how many times you want to cycle through the series: ");
        int n = scan.nextInt();
        double y = x + 1;
        double e = 0;
        int i = 1;
        while (true) {
            if (i == n) {
                break;
            } else {
                e = y + ((x*x)/(i*i));
            }
        }
        return e;
    }

    public static void check (double x) {
        System.out.println(x);
        System.out.println(myexp());
        System.out.println(Math.exp(x));
    }

    public static void main(String[] args) {
        myexp();
    }
}
