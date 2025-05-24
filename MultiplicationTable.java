import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("The multiplication Table for "+n+" is:");
        for(int i =1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}