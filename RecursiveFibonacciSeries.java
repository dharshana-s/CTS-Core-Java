import java.util.Scanner;

public class RecursiveFibonacciSeries{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first =0;
        int second = 1;
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second =next;
            
        }
    }
}