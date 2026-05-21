// public class prac {
//     public static void printDec(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }


public class prac {
    public static void PrintInc(int n){
        if(n ==1){
            System.out.print(n + " ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5; 
        PrintInc(n);
    }
}