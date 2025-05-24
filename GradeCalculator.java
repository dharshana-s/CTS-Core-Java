import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mark out of 100:");
        int mark = input.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("Grade A");
        }else if(mark>=80 && mark<=89){
            System.out.println("Grade B");
        }else if(mark>=70 && mark<=79){
            System.out.println("Grade C");
        }else if(mark>=60 && mark<=69){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}