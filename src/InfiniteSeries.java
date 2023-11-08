import java.util.Scanner;
import java.util.stream.LongStream;
public class InfiniteSeries {

public static long factorialUsingStream(int n){

    return LongStream.rangeClosed(1, n).reduce(1,(long x, long y) -> x*y);

    }
    public static double myExp(double x, int n){
    double e = 0.0;
    for(int i =0; i<=n; i++){
        e += Math.pow(x, i) / factorialUsingStream(i);
        }
    return e;
    }
    public static double check(double x){
        System.out.println(x);
        System.out.println(myExp(x, 4));
        System.out.println(Math.exp(x));
        return x;
    }
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter .1, 1.0, 10.0, 100.0 for X only ");
double x = s.nextDouble();
   while(true){
       if(x == .1) {
           check(x);
           break;
       }else if(x == 1.0){
           check(x);
           break;
       }else if(x == 10.0){
           check(x);
           break;
       }else if(x == 100.0){
          check(x);
           break;
       }

   }
        System.out.println("Enter -.1, -1.0, -10.0, -100.0 for X only ");
   double y= s.nextDouble();
        while(true){
            if(y == -.1) {
                check(y);
                break;
            }else if(y == -1.0){
                check(y);
                break;
            }else if(y == -10.0){
                check(y);
                break;
            }else if(y == -100.0){
                check(y);
                break;
            }

        }

    }
}
