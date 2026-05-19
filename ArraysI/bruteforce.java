public class bruteforce {
    public static void maxSum(int num[]){
        int largest = Integer.MIN_VALUE;
        int ts = 0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=0; j<num.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                  sum +=num[k];
                  if(largest<sum){
                    largest=sum;
                  }
                  ts++;
                }
            }
        }
        System.err.println("largest array : " + largest);
        System.err.println("Total number of array : " + ts);
    }
    public static void main(String agrs[]){
        int num[] = {2, 4, 6, 8, 10};
        maxSum(num);
    }
}
