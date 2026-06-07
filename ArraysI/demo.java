import java.util.Scanner;

public class demo {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String agrs[]){
        int marks[] = {97, 99, 98, 100};
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}

