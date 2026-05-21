// public class strings {
//     public static String subString(String str, int si, int ei) {
//         String substr = " ";
//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//     }

//     public static void main(String args[]) {
//         String str = "Hello World!";
//         System.out.println(subString(str, 0, 5));
//     }
// }

// public class strings {
//     public static void main(String agrs[]){
//         String fruits[] = {"apple", "mango", "banana"};

//         String largest = fruits[0];
//         for(int i=1; i<fruits.length; i++){
//             if(largest.compareTo(fruits[i])<0){
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// public class strings {
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a'; ch<='z'; ch++){
//             sb.append(ch + " ");
//         }
//         System.out.println(sb);
//     }
// }

// public class strings {
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String agrs[]){
//         String str = "hi, i am kajal";
//         System.out.println(toUpperCase(str));
//     }
// }

// public class strings {
//     public static String compress(String str){
//         String newStr = "";

//         for(int i=0; i<str.length(); i++){
//             Integer count = 1;
//             while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 count++;
//                 i++;

//             }
//             newStr += str.charAt(i);
//             if(count>1){
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String[] args) {
//         String str = "aaabbcccd";
//         System.out.println(compress(str));
//     }
// }

// import java.util.Scanner;

// public class strings {
//     public static int checkVowels(String str) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         System.out.println(checkVowels(str));

//     }
// }


// public class strings {
//     public static void main(String[] args) {
//         String str = "kajal";
//         String str1 = "yadav";
//         String str2 = "kajal";
//         System.out.println(str.equals(str1) + " " + str.equals(str2));
//     }
// }
// public class strings {
//     public static void main(String[] args) {
//         String str = "Apnacollege".replace("p", "");
//         System.out.println(str);
//     }
// }

public class strings {
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Length check
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0; i<str2.length(); i++){
            char ch = str1.charAt(i);

            int index = str2.indexOf(ch);

            //if character not found -> not anagram
            if(index == -1){
                return false;
            }
            //Remove that character from str2
            str2 = str2.substring(0, index) + str2.substring(index+1);
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}