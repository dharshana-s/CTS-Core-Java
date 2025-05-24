public class TypeCast{
    public static void main(String[] args){
        int num1 = 12;
        double num2 = 12.03;
        System.out.println("The integer is:"+num1);
        System.out.println("The double is:"+num2);
        int myInt = (int) num2;
        double myDouble = (double) num1;
        System.out.println("The integer to double is:"+myDouble);
        System.out.println("The double to integer is:"+myInt);
    }
}