import java.util.Scanner;

public class EvenOrOddChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num+" is an Even Number");
        }else{
            System.out.println(num+" is an Odd Number");
        }
    }
}