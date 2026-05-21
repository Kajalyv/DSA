// public class prac{
//     public static int linearSearch(int numbers[], int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 5, 6, 9};
//         int key = 4;
//         int index =  linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("number is not found");
//         }else{
//             System.out.println("number found at index " +index);
//         }

//     }
// }

// public class prac {
//     public static int findMenu(String menu[], String key){
//         for(int i = 0; i<menu.length; i++){
//             if(menu[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]){
//         String menu[] = {"Samosa", "Burger", "Dosa", "Chole"};
//         String key = "Dosa";
//         int index = findMenu(menu, key);
//         if(index ==-1){
//             System.out.println("menu is not found");
//         }else{
//             System.out.println("menu found at index: " + index);
//         }
//     }
// }

// public class prac {
//     public static int largestNum(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest>numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println(smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {3, 5, 22, 76, 45};
//        int index =  largestNum(numbers);
//        System.out.println(index);
//     }
// }

// public class prac {
//     public static int binarySearch(int numbers[], int key){
//         int start=0, end = numbers.length-1;
//         while (start<=end) {
//             int mid = (start+end)/2;
//             if(key ==numbers[ mid]){
//                 return mid;
//             }
//             if(key>numbers[ mid]){
//              start = mid +1;
//             }
//             if(key<numbers[ mid]){
//               end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;
//         int index = binarySearch(numbers, key);
//         System.out.println("number found at index: " + index);
//     }
// }

// public class prac {
//     public static int binarySearch(int numbers[],int key){
//         int start =0, end = numbers.length-1;
//         while (start<=end) {
//             int mid = (start+end)/2;
//             if(key == numbers[mid]){
//                 return mid;
//             }
//             if(key>numbers[mid]){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//             }
//            }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 109 ;
//         System.out.println(binarySearch(numbers, key));
//     }
// }

//reversing an array 

// public class prac {
//     public static void reverseArray(int numbers[]){
//        int first =0, last = numbers.length-1;
//        while (first<last) {
//         int temp = numbers[last];
//         numbers[last] = numbers[first];
//         numbers[first] = temp;
//         first++;
//         last--;
//        }

//     }

//     public static void main(String[] args) {
//         int numbers[] ={2, 5, 8, 4, 29, 34, 50};
//           reverseArray(numbers);

//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();

//     }
// }

//reversing an array

// public class prac {
//     public static void reverseArray(int numbers[]){
//         int start =0, last=numbers.length-1; 
//         while (start<last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[start];
//             numbers[start] = temp;
//             start++;
//             last--;

//         }
//     }
//     public static void main(String[] args) {
//         int numbers[] = { 2, 5, 6, 8, 2, 4, };
//         reverseArray(numbers);
//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }

//pair in arrays

// public class prac {
//     public static void printPairs(int number[]){
//         for(int i=0; i<number.length; i++){
//             int curr = number[i];
//             for(int j=i+1; j<number.length; j++){
//                 System.out.print("(" + curr + "," + number[j] + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int number[]  = {2, 5, 7, 9, 3, 6};
//         printPairs(number);
//     }
// }

//print subarrays

// public class prac {
//     public static void subArrays(int number[]){
//         int ts = 0;
//         for(int i=0; i<number.length; i++){
//             int start = i; 
//             for(int j=i; j<number.length; j++){
//                 int end = j;
//                 int sum = 0;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(number[k] + " ");
//                     sum+=number[k];
//                 }
//                 ts++;
//                  System.out.println();
//                 System.out.println( "sum of array " +sum);

//             }
//         }System.out.println(ts);
//     }
//     public static void main(String[] args) {
//         int number[] = {3, 5, 7, 9, 10};
//         subArrays(number);
//     }
// }

// public class prac {
//     public static void subArrays(int number[]){
//         int ts = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i=0; i<number.length; i++){
//             int start = i;
//             for(int j=i; j<number.length; j++){
//                 int end = j;

//                 for(int k=start; k<=end; k++){
//                     System.out.print(number[k] + " ");
//                     currSum+=number[k];
//                 }
//                 ts++;
//                 System.out.println();
//                if(maxSum<currSum){
//                 maxSum = currSum;
//                }
//             }
//             System.out.println();

//         }
//          System.out.println("max of array: " + maxSum);
//          System.out.println(ts);
//     }
//     public static void main(String[] args) {
//         int number[] = {1, 2, 3, 4};
//         subArrays(number);

//     }
// }

//kadanes algorithms

// public class prac {
//     public static void kadanesAlgo(int number[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i=0; i<number.length; i++){
//             cs+=number[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms = Math.max(cs, ms); 
//         }
//         System.out.println(ms);
//     }
//     public static void main(String[] args) {
//         int number[] = {2, 5, 6, 8};
//         kadanesAlgo(number);
//     }
// }

//tapping water

// public class prac {
//     public static int tappedWater(int height[]) {
//         int n = height.length;
//         // calculating leftmax bounderies
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(leftmax[i], height[i - 1]);
//         }

//         // calculating right max bounderies

//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(rightMax[i], height[i + 1]);
//         }

//         int tappedWater = 0;
//         // loop

//         for (int i = 0; i < n; i++) {
//             int waterLevel = Math.min(rightMax[i], leftmax[i]);
//             tappedWater += waterLevel - height[i];
//         }
//         return tappedWater;

//     }

//     public static void main(String[] args) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(tappedWater(height));
//     }
// }

// public class prac {
//     public static int tappedWater(int height[]) {
//         int n = height.length;

//         // calculating left max bounderies
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(leftmax[i - 1], height[i]);
//         }

//         // calculating right max bounderies
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//         }

//         // loop
//         int tappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             int waterLevel = Math.min(rightMax[i], leftmax[i]);
//             tappedWater += waterLevel - height[i];
//         }
//         return tappedWater;
//     }

//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         System.out.println(tappedWater(height));
//     }
// }

//profit & lose

// public class prac {
//     public static int buyAndsellStocks(int height[]){
//         int maxProfit = Integer.MAX_VALUE;
//         for(int i=0; i<height.length; i++){
//             if(maxProfit<height[i]){
//                 maxProfit= height[i];
//             }else{
//                 maxProfit = height[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int height[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(buyAndsellStocks(height));
//     }
// }

// public class prac {
//     public static int buyAndsellStocks(int price[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0; i<price.length; i++){
//             if(buyPrice<price[i]){
//                 int profit = price[i]-buyPrice;
//                 maxProfit= Math.max(maxProfit, profit);
//             }else{
//                 buyPrice=price[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int price[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(buyAndsellStocks(price));
//     }
// }

// public class prac {
//     public static void tappedWater(int height[]){
//         int n = height.length;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftMax[i] = Math.max(leftMax[i-1], height[i]);
//         }

//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightMax[i] = Math.max(rightMax[i+1], height[i]);
//         }

//         int tappedWater = 0;
//         for(int i=0; i<n; i++){
//             int waterLevel = Math.min(rightMax[i], leftMax[i]);
//             tappedWater += waterLevel -height[i];
//         }
//         System.out.println(tappedWater);
//     }
//     public static void main(String[] args) {
//         int height[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//         tappedWater(height);
//     }
// }

// public class prac {
//     public static boolean findDublicate(int number[]){
//         for(int i=0; i<number.length; i++){
//             for(int j=i+1; j<number.length; j++){
//                 if(number[i] == number[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int number[] = {1, 7, 4, 3, 0};
//         System.out.println(findDublicate(number));
//     }
// }

public class prac {
    public static void maxSubarray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        maxSubarray(number);
    }
}