

public class InfiniteSeries {

    /**public static double fact(double in){
        double out = 1;
        for(double x = 1; x<=in; x++){
            out *= x;
        }
        return out;
    }
**/
    public static double myExp(double x, double n){
        double e = 1.0;
        double d = 1;
        double nu = 1;
        for(int i=1; i<=n; i++){
            nu *=x;
            d *=i;
            e += nu / d;
            //e += Math.pow(x, i) / fact(i);
        }
        return e;
    }

    public static void check(double x){
        System.out.printf("%f\t%f\t%f", x, myExp(x, 10), Math.exp(x));

    }


    public static void main(String[] args) {
        check(2.0);



    }
}

//numerator is nu*=x
//denominator is d*= i