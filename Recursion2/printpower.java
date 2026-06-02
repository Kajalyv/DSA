// public class printpower {
//     public static int printPower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         int xnm1 = printPower(x, n-1);
//         int xn = x * xnm1;
//         return xn;
//     }


//     public static void main(String[] args) {
//         System.out.println(printPower(2, 5));
//     }
// }


// public class printpower {
//     public static int printPower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         return x* printPower(x, n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(printPower(2, 5));
//     }
// }

// optimized approach

public class printpower {
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if (n%2 != 0) {
            halfPowerSq = x *halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(optimizedPower(x, n));
    }
}