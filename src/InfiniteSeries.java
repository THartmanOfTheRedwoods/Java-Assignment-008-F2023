public class InfiniteSeries {

public static double myEXP(double x, int n){
    double e = Math.pow(1/x , n*(n - 1))/factorial(n + 1);
    return e;
}
public static int factorial(int n){
    if (n == 0){
        return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
}
public static void check(int n){
    System.out.println(n);
    System.out.println(myEXP(n,n));
    System.out.println(Math.exp(n));
}
    public static void main(String[] args) {
check(1);
    }
}
