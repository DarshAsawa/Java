import java.util.Scanner;

class Fact{
static int factorial(int n){
if(n==0)
return 1;
else
return(n * factorial(n-1));
}
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number :");
int number=input.nextInt();
int fact=number;

   if(number<0){
	try{
	throw new ArithmeticException();
	}
	catch(ArithmeticException e){
	System.out.println("Factorial cannot be found");
	}
   }
	else {
System.out.println("Factorial of the number is :"+factorial(number));
}

} 
}