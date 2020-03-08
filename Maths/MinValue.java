import java.util.Scanner;
/*
Min of two numbers : 
i.e. is 5>4 - No! 
or 4>5 - Yes!
*/

public class MinValue{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int number1= scan.nextInt();

        System.out.print("Enter number 2 : ");
        int number2=scan.nextInt();

        System.out.println("Minimum out of the two number is: "+ max(number1,number2) );

        scan.close();

    }

    private static int max(int a, int b) {
        return a >=b ? b : a;
    }
}