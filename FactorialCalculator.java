import java.util.Scanner;

public class FactorialCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int num = input.nextInt();
        int fact=1;
        if(num==0){
            System.out.println("Factorial of "+num+" is: 1");
        }else{
            for(int i=1;i<=num;i++){
                fact*=i;
            }
             System.out.println("Factorial of "+num+" is: "+fact);
        }
       
    }
}