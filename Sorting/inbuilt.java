import java.util.Arrays;

public class inbuilt {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String agrs[]) {
        int arr[] = { 4, 2, 0, 7, 6, 10 };
        Arrays.sort(arr, 0, 3);
        printArr(arr);
    }
}