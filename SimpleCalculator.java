import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second Number:");
        int num2 = input.nextInt();
        System.out.println("Enter the operation to take place:");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int opt = input.nextInt();
        switch(opt){
            case 1:
                System.out.println("Addition: "+ (num1+num2));
                break;
            case 2:
                System.out.println("Subtraction: "+ (num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: "+ (num1*num2));
                break;
            case 4:
                System.out.println("Division: "+ (num1/num2));
                break;
            default:
                System.out.println("Invalid Operation");
        }

    }
}