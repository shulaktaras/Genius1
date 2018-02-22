public class Function {
    public static void main(String[] args) {
//        f(1);

        int fac = factorial(4);
        System.out.println(fac);

//        int fac2 = factorial(5);
//        System.out.println(fac2);

    }

//
//    public static void f(int x){
//
//        if(x<15){
//            f(x * 2);
//        }System.out.print(" " + x);
//    }

//    static int factorial(int x){
//        int result=1;
//        for (int i = 1; i <= x; i++)
//        {
//            result *= i;
//        }
//        return  result;
//    }

    //EXPLAIN ME
    static int factorial(int x){
        if (x == 1){
            return 1;
        }
        else{
            return x * factorial(x - 1);
        }
    }

    //EXPLAIN TOO
//    static int fibonachi(int n){
//
//        if (n == 0){
//            return 0;
//        }
//        if (n == 1){
//            return 1;
//        }
//        else{
//            return fibonachi(n - 1) + fibonachi(n - 2);
//        }
//    }





}
