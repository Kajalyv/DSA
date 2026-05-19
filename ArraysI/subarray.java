// public class subarray {
//     public static void printSubarray(int num[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < num.length; i++) {
//             int start = i;
//             for (int j = i + 1; j < num.length; j++) {
//                 int end = j;
//                 currSum++;
//                 for (int k = start; k < end; k++) {
//                     currSum += num[k];
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }

//         }
//         System.out.println("max sum = " + maxSum);
//     }

//     public static void main(String agrs[]) {
//         int num[] = { 2, 4, 6, 8, 10 };
//         printSubarray(num);
//     }
// }

public class subarray {
    public static void printSubarray(int num[]) {
       int larget = Integer.MIN_VALUE;
        int ts = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <=end; k++) {
                    System.err.print(num[k] + " ");
                    sum += num[k];
                    if(larget<sum){
                        larget= sum;
                    }
                    
                }
                ts++;
                System.out.println();
                System.out.println( "sum of array " + sum );
            }
            System.err.println();
        }
        System.err.println( "total no of array : " + ts);
        System.out.println("largest array is : " + larget);
    }

    public static void main(String agrs[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        printSubarray(num);
    }
}