import java.util.Scanner;

public class ArraySumAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = input.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of the elements in an array are: "+sum);
        System.out.println("The average of the elements in an array are: "+(sum/n));
    }
}