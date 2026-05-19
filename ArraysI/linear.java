// public class linear {

//     public static int linearSearch(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
//         int key = 10;
//         int index = linearSearch(number, key);
//         if (index == -1) {
//             System.out.println("number not found");
//         } else {
//             System.out.println("number found at " + index);
//         }
//     }
// }

// public class linear {
//     public static int linearSearch(String num[], String key) {
//         for (int i = 0; i < num.length; i++) {
//             if (num[i].equals(key)) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         String num[] = { "Samosa", "Jalebi", "Dosa", "Panipuri" };
//         String key = "Dosa";

//         int index = linearSearch(num, key);

//         if (index == -1) {
//             System.out.println("Key not found");
//         } else {
//             System.out.println("Item found at index: " + index);
//         }
//     }
// }

public class linear {
    public static int linearSearch(String num[], String key){
     for(int i=0; i<num.length; i++){
        if(num[i].equals(key)){
            return i;
        }
     }
     return -1;
    }
    public static void main(String agrs[]){
        String num[] = { "Samosa", "Jalebi", "Dosa", "Panipuri" };
        String key = "Samosa";
        int index = linearSearch(num, key);
        if(index == -1){
            System.out.print("String are not found");
        }else{
            System.out.print("String is found at : " + index);
        }
        System.out.println();
    }
}